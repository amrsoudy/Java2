/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author 1795162
 */
public class Utilitaire {
    
    /**
     * Methode  super special unique au monde
     * @param <T> ypt generic 
     * @param tab  collection sur lequell on ba iteriter
     */
     public static <T> void affichertab(T[] tab) {

        for (T t : tab) {

            System.out.println(t);

        }

    }
     
     /**
        * @param tab collection non interissant
      */
  public static void affichertab(String[] tab) {

        for (String t : tab) {

            System.out.println(t);

        }

    }    
}


