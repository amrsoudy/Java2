/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.ListProduits;
import persistance.Maniplation;
import vue.Fen1;

/**
 *
 * @author 1795162
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        ListProduits lp = new ListProduits();

        Maniplation mani = new Maniplation(lp);
        Fen1 fen1 = new Fen1(mani, lp);
        fen1.setVisible(true);
        fen1.setResizable(false);
        fen1.setLocationRelativeTo(null);

    }

}
