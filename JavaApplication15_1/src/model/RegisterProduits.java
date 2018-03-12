/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author AMR
 */
public class RegisterProduits extends ArrayList<Produit>{

    public void afficher() {
        for(Produit p : this){
            System.out.println(p);
        
        }


    }

    public void ajouterArticle(Produit p) {
        this.add(p);
    }
    
}
