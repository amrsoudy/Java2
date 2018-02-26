/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JFrame;
import vue.vue1;

/**
 *
 * @author 1795162
 */
public class Appctr {

    /**
     * @param args the command line arguments
     */
       public static void main(String args[]) {
           
           vue1 fen1 =  new vue1();
           fen1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           fen1.setResizable(false);
           fen1.setLocationRelativeTo(null);
           
           fen1.setVisible(true);
      
       }
}
