/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import persistance.AllLists;
import persistance.App;
import persistance.Client;

/**
 *
 * @author 1795162
 */
public class Manipaltion {

    AllLists al = new AllLists();

    public <U> void ecrire(U u, String[] list) {

        File file = new File((String) u);
        FileWriter fw = null;
        BufferedWriter bw = null;
        String line = "";

        line = parsceList(list);

        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);

            bw.write(line);
            bw.newLine();
                        JOptionPane.showMessageDialog(null, " CLIENT text Added");


        } catch (IOException ex) {
            Logger.getLogger(Manipaltion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                if (bw != null) {
                    bw.close();

                }
                if (fw != null) {
                    fw.close();

                }

            } catch (IOException ex) {
                Logger.getLogger(Manipaltion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void addObject(String txt, String[] list) {

        if (txt.equals("client")) {

            Client c = new Client(list[0], list[1], list[2]);

            al.put(String.valueOf("C"), c);

            JOptionPane.showMessageDialog(null, " CLIENT Added");

            if (al.containsKey("C")) {
                System.out.println(al.get("C"));
            }

        }
        if (txt.equals("App")) {

            App app = new App(list[0], list[1], list[2], list[3], list[4], list[5]);

            al.put(String.valueOf("App"), app);

            JOptionPane.showMessageDialog(null, "APPARTMENT Added");

            if (al.containsKey("App")) {
                System.out.println(al.get("App"));
            }

        }
    }

    private String parsceList(String[] list) {
        String line = "";
        for (int i = 0; i < list.length; i++) {

            if (i == list.length - 1) {
                line = line + list[i];

            } else {

                line = line + list[i] + ",";
            }

        }

        return line;

    }

    public <U> ArrayList<String[]> ReadFile(U u) {
        File file = new File((String) u);
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        ArrayList<String[]> lists = new ArrayList();
        String[] list = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                list = line.split(",");
                lists.add(list);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipaltion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manipaltion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {

                    br.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Manipaltion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lists;

    }

    public void print(JTable jTable) {

        MessageFormat header = new MessageFormat("Report Print");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {

            jTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (java.awt.print.PrinterException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Alarm", JOptionPane.ERROR_MESSAGE);
        }
    }

}
