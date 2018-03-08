/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Produit;
import modele.RegistreProduits;

/**
 *
 * @author HBenteftifa
 */
public class ManipulationFichier {

    public static void lireFichier(String nomFichier, RegistreProduits registre) {
        FileReader fr = null;
        try {
            File file = new File(nomFichier);
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            //Faire la lecture
            String ligne;
            //RegistreArticles registre = new RegistreProduits();
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
                //extraire les tokens / description-prix et qte
                Produit obj = parseLigne(ligne);
                //ajouter dans la liste des articles                
                registre.ajouterArticle(obj);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private static Produit parseLigne(String ligne) {
        String[] tokens = ligne.split(" ");
        String description = tokens[0] ;
        int qte = Integer.parseInt(tokens[1]);

        double prix = Double.parseDouble(tokens[2]);
        /* regle de transformation */
        
        return new Produit(description, qte, prix);
    }

  

    private static String formerLigne(Produit article) {
        String ligne;
        ligne =article.getDescription()+";"+article.getPrix()+";"+
                article.getQte()+"\n";
        return ligne;
      }
 
}
