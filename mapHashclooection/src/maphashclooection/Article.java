/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maphashclooection;

/**
 *
 * @author AMR
 */
public class Article implements Comparable<Article>{
    
    private String nom ;
    private int qte ;
    private Double prix ;

    public Article(String nom, int qte, Double prix) {
        this.nom = nom;
        this.qte = qte;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article{" + "nom=" + nom + ", qte=" + qte + ", prix=" + prix + '}';
    }

    @Override
    public int compareTo(Article o) {
        
        if(this.nom.equals(o.nom)){
        
        if(this.qte == o.qte) return 0 ;
        else if(this.qte > o.qte) return 1 ;
        else return -1;
        
        } else
        
        return 0 ;
    }
    
}
