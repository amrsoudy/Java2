/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author HBenteftifa
 */
public class Produit {
    private String description;
    private int qte;
    private double prix;

    public Produit() {
    }

    public Produit(String description, int qte, double prix) {
        this.description = description;
        this.qte = qte;
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article{" + "description=" + description + ", qte=" + qte + ", prix=" + prix + '}';
    }
    
    
}
