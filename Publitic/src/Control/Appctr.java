/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vue.UserPass;
import javax.swing.JFrame;

/**
 *
 * @author AMR
 */
public class Appctr {
 
    public static void main(String[] args) {   
    int HIGHT = 600,WIDTH = 350 ;
    UserPass userpass = new UserPass();
    userpass.run();
    userpass.setSize(HIGHT,WIDTH);
    userpass.setLocationRelativeTo(null);
    userpass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    userpass.setVisible(true);
 
    }
    
}
