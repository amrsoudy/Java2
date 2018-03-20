/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

/**
 *
 * @author AMR
 */
public class Produit implements Comparable<Produit> {
    private String name ;
    private double prix ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Produit(String name, double prix) {
        this.name = name;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" + "name=" + name + ", prix=" + prix + '}';
    }

    public int compareTo(Produit  p) {
        
       return this.name.compareTo(p.getName());
       
}

      }

    
  
