/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.TreeSet;

/**
 *
 * @author 1795162
 */
public class Article implements Comparable {
    
    private String Desc ;
    private int qte;
    private double prix ;

    public Article() {
    }

    public Article(String Desc, int qte, double prix) {
        this.Desc = Desc;
        this.qte = qte;
        this.prix = prix;
        
        
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
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
        return "Article{" + "Desc=" + Desc + ", qte=" + qte + ", prix=" + prix + '}';
    }



    @Override
    public int compareTo(Object o) {
        TreeSet ts = new TreeSet();
        return 0;
    }
    
    
    
}
