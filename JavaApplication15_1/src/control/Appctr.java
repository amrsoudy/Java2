/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.RegisterProduits;
import persistance.Manipulation;
import vue.Fen1;

/**
 *
 * @author AMR
 */
public class Appctr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RegisterProduits register = new RegisterProduits();
        Manipulation.lireFicher("data.txt",register);
        
        register.afficher();
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fen1().setVisible(true);
            }
        });
    }
    
}
