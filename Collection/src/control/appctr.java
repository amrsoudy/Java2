/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import utils.Utilitaire;

/**
 *
 * @author 1795162
 */
public class appctr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] tabInt = {1, 2, 3, 4, 5};
        Double[] tabDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] tabCha = {'H', 'E', 'L', 'L'};

        Utilitaire.affichertab(tabCha);
        Utilitaire.affichertab(tabDouble);
        Utilitaire.affichertab(tabInt);

        
        
    }

}
