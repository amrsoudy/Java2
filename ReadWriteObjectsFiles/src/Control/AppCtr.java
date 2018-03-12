/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Persistance.Manipulation;
import model.Lists;
import vue.FenReadWrite;

/**
 *
 * @author AMR
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lists ls = new Lists();
      
        
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenReadWrite(ls).setVisible(true);
            }
        });    }
    
}
