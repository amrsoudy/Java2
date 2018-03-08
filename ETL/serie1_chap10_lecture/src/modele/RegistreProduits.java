/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author HBenteftifa
 */
public class RegistreProduits extends ArrayList<Produit>{
    
    public void ajouterArticle(Produit art){
        this.add(art);
    }
    
    public void afficherArticles(){
        for (Produit art : this){
            System.out.println(art);
        }
    }
}
