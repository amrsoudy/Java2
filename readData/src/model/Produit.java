/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 1795162
 */
public class Produit {
    
    private String nom ;
    private int num ;
    private double prix ;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Produit(String nom, int num, double prix) {
        this.nom = nom;
        this.num = num;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" + "nom=" + nom.toUpperCase() + ", num=" + num + ", prix=" + prix + '}';
    }
    
    
}
