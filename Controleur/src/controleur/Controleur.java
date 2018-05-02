/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author AMR
 */
public class Controleur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String pattern = "HH:mm:ss";
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);

LocalDateTime now  = LocalDateTime.now();

        System.out.println(now);
                System.out.println(dtf.format(now));

                
                
                
                ;



    }
    
}
