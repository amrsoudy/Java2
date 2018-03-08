/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import module.Produit;
import module.ListeProduits;

/**
 *
 * @author 1795162
 */
public class Utilitaire {

    ListeProduits lp = new ListeProduits();

    public Utilitaire() {
    }

    public void ajouterProduite() {

        File file = new File("textin.txt");
        FileReader fr = null;
        String s = "";
        BufferedReader br = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            System.out.println("BR :"+br.readLine());
            while ((s= br.readLine()) != null) {
                Produit pr = new Produit();
                String[] sArray = s.split(",");
                pr.setNom(sArray[0]);
                pr.setPrix(Double.parseDouble(sArray[1]));
                pr.setQuantity(Integer.parseInt(sArray[2]));
                lp.add(pr);
            
                

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public String lireProduite() {

        String s = "";

        for (Produit pr : lp) {

            System.out.println(pr);

        }
        return s;

    }

}
