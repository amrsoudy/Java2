/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.Control;
import model.Manipaltion;
import vue.Vue;

/**
 *
 * @author 1795162
 */
public class Main {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manipaltion mani = new Manipaltion();
        Vue vue =new Vue(mani);
        Control control = new Control(mani,vue);
        
        vue.setVisible(true);
        vue.setLocationRelativeTo(null);
      
        vue.setResizable(false);
        
        
        
        
    }
    
}
