/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ListerProduit;
import model.Produit;

/**
 *
 * @author 1795162
 */
public class ManiplationFicher {

    public static void readFicher(String datatxt, ListerProduit register) {

        File file = new File(datatxt);
        FileReader fr = null;
        BufferedReader br = null;
        String ligne = "";

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            try {
                while ((ligne = br.readLine()) != null) {
                    register.add(ListerProduit.parceLigne(ligne));

                }
            } catch (IOException ex) {
                Logger.getLogger(ManiplationFicher.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManiplationFicher.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void AfficherProduit(ListerProduit register) {

        for (Produit p : register) {

            if (p.getNum() < 26) {

                p.setPrix(p.getPrix() - (p.getPrix() * 0.10));

            }
            System.out.println(p);

        }

    }

}
