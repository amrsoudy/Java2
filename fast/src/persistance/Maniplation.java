/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ListProduits;
import model.personne;

/**
 *
 * @author 1795162
 */
public class Maniplation {
    private ListProduits lp ;

    public Maniplation(ListProduits lp) {
        
        this.lp=lp;
    }

    public void read(String path) {
        
        File file = new File(path);
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        
        
        try {
            fr = new FileReader(file) ;
            br = new BufferedReader(fr);
            while ((line=br.readLine())!=null){
            
                String[] l = line.split(",");
                personne p = new personne(l[0],l[1],Integer.parseInt(l[2]),Double.parseDouble(l[3]));
                
                lp.add(p);
            
            
            }
            
            
            
            
           } catch (FileNotFoundException ex) {
            Logger.getLogger(Maniplation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Maniplation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

 

    public void ecireToText(String path, String s) {
        
        File file = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(s);
            bw.newLine();
            
        } catch (IOException ex) {
            Logger.getLogger(Maniplation.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            try {
                fw.close();
                
                {bw.close();}
            } catch (IOException ex) {
                Logger.getLogger(Maniplation.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
              
                
        
    }
    
}
