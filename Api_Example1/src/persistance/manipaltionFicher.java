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

/**
 *
 * @author 1795162
 */
public class manipaltionFicher {
        public static void lireFicher(String ficher) {
        //lecture la ficher
        
        File  file = new File(ficher);
        FileReader fr = null ;
        
        try {
            int c = 0;
            fr = new FileReader(file);
            while((c= fr.read())!= -1){
                System.out.print((char)c);
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(manipaltionFicher.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            
            try {
                if(fr != null){
                    fr.close();
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(manipaltionFicher.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    public static void ecrireFicher(String ficherin, String ligne) {
        
        File file = new File(ficherin);
        FileWriter fw = null ;
        
            try {
                fw = new FileWriter(file);
                fw.write(ligne);
                
                
                
                
            } catch (IOException ex) {
                Logger.getLogger(manipaltionFicher.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            if (fw != null){
            
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(manipaltionFicher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            }
        
    }

    public static void lireFicher2(String ficherout2) {
        
        File file  = new File(ficherout2);
        File file2 = new File("x.txt");
        
        FileReader fr = null;
        FileWriter fw =null ;
         System.out.println(" ");
        
            try {
                fr = new FileReader(file);
                fw = new FileWriter(file2,true);
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(fw);
                String s ;
                
                while((s =br.readLine())!= null){
                   
                    System.out.println(s);
                    bw.write(s);
              
                }
                
          
            } catch (FileNotFoundException ex) {
                Logger.getLogger(manipaltionFicher.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(manipaltionFicher.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            
            try {
                fw.close();
                fr.close();
                
               
            } catch (IOException ex) {
                Logger.getLogger(manipaltionFicher.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
        
    }

  
    
   
    
    
    

    

    
    
}
