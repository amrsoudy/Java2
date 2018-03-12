/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import model.Article;
import model.ArticleComarator;

/**
 *
 * @author 1795162
 */
public class Hashtree1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Article ar1 = new Article("livre", 15, 55.5);
        Article ar2 = new Article("voiture", 15, 60.5);
        Article ar4 = new Article("bus", 15, 90.5);
        Article ar5 = new Article("livre", 15, 55.5);
        Article ar6 = new Article("livre", 15, 20.5);
        Article ar3 = new Article("bus", 15, 80.5);

//        HashSet hs = new HashSet(3, 0.5f);
//        hs.add(ar1);
//        hs.add(ar2);
//        hs.add(ar3);
//        hs.add(ar4);
        //System.out.println(hs);
        //TreeSet<Article> ts = new TreeSet(new ArticleComarator());
        ArrayList<Article> ts = new ArrayList();
        ts.add(ar1);
        ts.add(ar2);
        ts.add(ar4);
        ts.add(ar5);
        ts.add(ar6);
        ts.add(ar3);

        System.out.println(ts);

    }

}
