package control;

import modele.RegistreProduits;
import persistance.ManipulationFichier;
import utils.Utilitaire;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HBenteftifa
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenue dans ETL");
        RegistreProduits registre = new RegistreProduits();
        System.out.println("++++++++++++++++++++++++Extraction ++++++++++++++++++++++++");

        ManipulationFichier.lireFichier("data.txt", registre);
        System.out.println("++++++++++++++++++++++++Sortie Registre Sans transformation ++++++++++++++++++++++++");
        registre.afficherArticles();
        }

}
