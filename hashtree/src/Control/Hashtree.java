/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author 1795162
 */
public class Hashtree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashSet hs = new HashSet(5, 0.5f);
        System.out.println(hs.add("un"));
        System.out.println(hs.add("deux"));

        System.out.println(hs.add("trois"));

        System.out.println(hs.add("quatre"));

        System.out.println(hs);

        //
        Boolean b = hs.add("un");
        System.out.println("peut on ajouter un double  " + b);

        System.out.println(hs);
        // creer un treeset
        TreeSet ts = new TreeSet();
        System.out.println(ts.add("un"));
        System.out.println(ts.add("deux"));
        System.out.println(ts.add("trois"));
        System.out.println(ts.add("quatre"));
        
        // afficher un treeset
        System.out.println(ts);
        //ajouter un double 
        Boolean t = ts.add("deux");
        System.out.println("peut pas ajouter un double  "+ t);
        System.out.println(ts);
        
        LinkedHashSet lh = new LinkedHashSet();
        System.out.println(lh.add("un"));
        System.out.println(lh.add("deux"));
        System.out.println(lh.add("trois"));
        System.out.println(lh.add("quatre"));
        
        System.out.println(lh);
        
                
                
        
    }

}
