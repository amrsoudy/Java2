/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Lists;
import model.ObjectClass;

/**
 *
 * @author AMR
 */
public class Manipulation {

    public static <U> void read(U u) {
        if ((String) u == "Clients.txt") {
            File file = new File((String) u);
            FileReader fr = null;
            BufferedReader br = null;
            String line = "";

            try {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                while (((line = br.readLine()) != null) && !(line.equals(""))) {
                    String[] obList = line.split(",");
                    ObjectClass ob = new ObjectClass();

                    ob.setO1(obList[0]);
                    ob.setO2(obList[1]);
                    ob.setO3(obList[2]);
                    ob.setO4(obList[3]);
                    ob.setO5(obList[4]);
                    ob.setO6(obList[5]);
                    ob.setO7(obList[6]);
                    ob.setO8(obList[7]);
                    ob.setO9(obList[8]);
                    ob.setO10(obList[9]);
                    ob.setO11(obList[10]);
                    ob.setO14("Clients");

                    ecrireFicher(ob, "Bin.dat");

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
            } finally {

                try {
                    fr.close();
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }else if ((String) u == "Appartements.txt") {
            File file = new File((String) u);
            FileReader fr = null;
            BufferedReader br = null;
            String line = "";

            try {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                while (((line = br.readLine()) != null) && !(line.equals(""))) {
                    String[] obList = line.split(",");
                    ObjectClass ob = new ObjectClass();

                    ob.setO1(obList[0]);
                    ob.setO2(obList[1]);
                    ob.setO3(obList[2]);
                    ob.setO4(obList[3]);
                    ob.setO5(obList[4]);
                    ob.setO6(obList[5]);
                    ob.setO7(obList[6]);
                    ob.setO8(obList[7]);
                    ob.setO9(obList[8]);
                    ob.setO10(obList[9]);
                    ob.setO11(obList[10]);
                    ob.setO14("App");

                    ecrireFicher(ob, "Bin.dat");

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
            } finally {

                try {
                    fr.close();
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

    }
    }
    public static <T, U> void ecrireFicher(T t, U u) {

        boolean exists = new File((String) u).exists();
        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream((String) u, true);
            oos = exists
                    ? new ObjectOutputStream(fos) {
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            } : new ObjectOutputStream(fos);

            oos.writeObject(t);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                oos.close();

            } catch (IOException ex) {
                Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static <U> Lists afficheData(U u,Lists ls,U u2) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(new File((String) u));
            ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                ObjectClass o = (ObjectClass)ois.readObject();
                if (o.getO14().equals((String)u2)){
                    ls.add(o);
                } 
                

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ls;
    }

    public static <U>void empty(U u ) {
        
        
        
    }

}
