/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import exceptions.monException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.produit;
import vue.fen2;

/**
 *
 * @author AMR
 */
public class Utilitaire {

    public void readData(String filename, JTable tab1) {
        DefaultTableModel model = (DefaultTableModel) tab1.getModel();
        model.setRowCount(0);

        File file = new File(filename);
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                String[] list = line.split(",");
                list[0] = list[0].toUpperCase();
                model.addRow(list);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                if (fr != null) {
                    fr.close();

                }
                if (br != null) {
                    br.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void remolierLeEcran(JFrame Fen) {

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int large = dim.width;
        int y = dim.height;
        Fen.setSize(large, y);
        Fen.setVisible(true);
        Fen.setLocationRelativeTo(null);

    }

    public void verifieretWrite(JTextField jTextField1, JTextField jTextField2, JTextField jTextField3, JTextField jTextField4, JTable tab1) {
        try {
            String regx = "[0-9]+";
            if (jTextField1.getText().matches(regx)) {
                throw new monException("name not possible include numbers");

            } else if (!jTextField3.getText().matches(regx)) {

                throw new monException("age must be numbers");

            } else if (!jTextField4.getText().matches(regx)) {

                throw new monException("Tel must be numbers");

            } else if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty()) {

                throw new monException("all filds must  remplier");
            } else {

                String line = jTextField1.getText() + ","+jTextField2.getText() + "," + jTextField3.getText() + "," + jTextField4.getText();
                String [] lin ={jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText()}; 
               
                witeToFile("data.txt",line);
                writeToBin("data.dat",line);
                DefaultTableModel model = (DefaultTableModel)tab1.getModel();
            
                model.addRow(lin);
            }

        } catch (monException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

    private void witeToFile(String path, String line) {
        
        File file = new File(path);
        FileWriter fw= null;
        BufferedWriter bw = null ;
        
        
        
        try {
            
           
            fw = new FileWriter(file,true);
            bw = new BufferedWriter(fw);
            bw.write(line);
            bw.newLine();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        
            try {
                bw.close();
               fw.close();

               
                
                JOptionPane.showMessageDialog(null,"Added");
                
                } catch (IOException ex) {
                Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
            }
        
           
        
        }
        
    }

    private void writeToBin(String path, String line) {
        File file = new File(path);
        FileOutputStream fos = null;
        ObjectOutputStream bos = null;
        String[] s = line.split(",");
        produit p = new produit(s[0],s[1],s[2],s[3]);
        
        
        
        try {
            fos = new FileOutputStream(file,true);
            bos = new ObjectOutputStream(fos);
            bos.writeObject(p);
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                bos.close();
                fos.close();
                JOptionPane.showMessageDialog(null,"added binairy");
            } catch (IOException ex) {
                Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }    

    public void readBin(String path, JTable tab1) {
        File file = new File(path);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        DefaultTableModel model =(DefaultTableModel)tab1.getModel();
        model.setRowCount(0);
        
        
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            
            while(fis.available()>0){
              produit p = (produit)ois.readObject();
              ArrayList<produit> arr = new ArrayList<>(); 
              arr.add(p);
              
              for (produit x : arr){
              
                  String [] s = {x.getNom(),x.getPrenom(),String.valueOf(x.getAge()),String.valueOf(x.getTel())};
                  model.addRow(s);
                               
          }
              
              
              
              
              
            
            
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        



    }


}    
        
    
        
        
    

