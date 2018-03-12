/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author AMR
 */
public class Produit {
    private String nom ;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
    private int qte ;
    private double prix;

    public Produit(String nom, int qte, double prix) {
        this.nom = nom;
        this.qte = qte;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" + "nom=" + nom + ", qte=" + qte + ", prix=" + prix + '}';
    }

    
    
}
