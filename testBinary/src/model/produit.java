/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author AMR
 */
public class produit implements Serializable {

    private String nom ;
    private String prenom ; 
    private int age ;
    private int  tel ;

    public produit(String string, String string0, String string1, String string2) {
        
        this.nom=string;
        this.prenom = string0;
        this.age = Integer.parseInt(string1);
        this.tel = Integer.parseInt(string2);
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
}
