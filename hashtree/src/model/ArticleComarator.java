/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;

/**
 *
 * @author 1795162
 */
public class ArticleComarator implements Comparator<Article> {

    public int compare(Article o1, Article o2) {

        if (o1.getDesc().compareTo(o2.getDesc()) == 0) {
            if ((o1.getPrix())==((o2.getPrix()))) {

                return 0;

            }

        }
        return 1;

    }

}
