/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ListerProduit;
import presistance.ManiplationFicher;
import vue.FenLister;

/**
 *
 * @author 1795162
 */
public class Appctr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListerProduit register = new ListerProduit();
        ManiplationFicher.readFicher("datatxt.txt",register);
        ManiplationFicher.AfficherProduit(register);
        
        
        FenLister fen1 = new FenLister(register);
        fen1.setVisible(true);
        fen1.setLocationRelativeTo(null);
        
        
        
        
        
        
        
    }

  
    
}
