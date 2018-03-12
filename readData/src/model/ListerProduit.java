/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 1795162
 */
public  class ListerProduit extends ArrayList<Produit> {

    public static Produit parceLigne(String ligne) {

        String[] list = ligne.split(" ");
        Produit p = new Produit(list[0], Integer.parseInt(list[1]), Double.parseDouble(list[2]));
        
        return p;
  
    }

}
