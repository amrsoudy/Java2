/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import utils.Utilitaire;
import vue.fen1;

/**
 *
 * @author AMR
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Utilitaire uti = new Utilitaire();
        fen1 fen = new fen1(uti);
        fen.setVisible(true);
        fen.setLocationRelativeTo(null);
        
        
        
    }
    
}
