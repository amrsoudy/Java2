/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produit;
import model.RegisterProduits;

/**
 *
 * @author AMR
 */
public class Manipulation {

    public static void lireFicher(String datatxt, RegisterProduits register) {
        File file = new File(datatxt);
        FileOutputStream fr = null;
        BufferedOutputStream br = null;
        String line;
        try {
            fr = new FileOutputStream(file);
            br = new BufferedOutputStream(fr);

            while ((line = br.readLine()) != null) {
                Produit p = pareceProudite(line);
                register.ajouterArticle(p);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                br.close();

            } catch (IOException ex) {
                Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static RegisterProduits lireFichertotable(String datatxt) {
        RegisterProduits reg = new RegisterProduits();
        File file = new File(datatxt);
        FileReader fr = null;
        BufferedReader br = null;
        String line;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                Produit p = pareceProudite(line);
                reg.ajouterArticle(p);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                br.close();

            } catch (IOException ex) {
                Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return reg;
    }

    private static Produit pareceProudite(String line) {

        String[] list = line.split(" ");
        String nom = list[0];
        int qte = Integer.parseInt(list[1]);
        double prix = Double.parseDouble(list[2]);

        return new Produit(nom, qte, prix);

    }

}
