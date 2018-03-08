/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import modele.Produit;
 
import modele.RegistreProduits;

/**
 *
 * @author HBenteftifa
 */
public class Utilitaire {

  
    public static void transformerArticles(RegistreProduits objListe) {
 
        transformerMaj(objListe);
        transformerPrix(objListe);

    }

    private static void transformerMaj(RegistreProduits objListe) {
 /*transformation de la description du produit en Majuscule. 
  */
        for (Produit article : objListe) {
            article.setDescription(article.getDescription().toUpperCase());     
        }  

    }

    private static void transformerPrix(RegistreProduits objListe) {
/*transformation   produits dont la quantité est inférieure à 26 
verront leur prix réduit de 20%.*/
        for (Produit article : objListe) {            
            if (article.getQte()< 26) {
                article.setPrix(article.getPrix()* .8f);
            }
        }   

    }
    
   private static void transformerPrix(RegistreProduits objListe, int qte, float rabais) {
/*transformation   produits dont la quantité est inférieure à 26 
verront leur prix réduit de 1-rabais.*/
        for (Produit article : objListe) {            
            if (article.getQte()< qte) {
                article.setPrix(article.getPrix() * (1-rabais));
            }
        }   

    } 
}
