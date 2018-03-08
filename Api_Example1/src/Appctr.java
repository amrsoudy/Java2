
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistance.manipaltionFicher;
import sun.applet.Main;
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1795162
 */
public class Appctr {
    public static void main(String[] args) {
        String ficher = "datain.txt";
        manipaltionFicher.lireFicher(ficher);
        String ficherout ="dataout.txt";
        String ligne = "la sortie et possible facile que l'entre ";
        manipaltionFicher.ecrireFicher(ficherout,ligne);
          ligne = "la sortie et possible facile que l'entre2 ";
        manipaltionFicher.ecrireFicher(ficherout,ligne);
        
        
        String ficherout2 = "dataout2.txt";
        
        manipaltionFicher.lireFicher2(ficherout2);
        


        
        
    
        }

        
        
        
    }

