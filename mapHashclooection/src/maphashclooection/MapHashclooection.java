/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maphashclooection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author AMR
 */
public class MapHashclooection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Boolean> map = new HashMap();
        map.put("hami", true);
        map.put("amr", false);
        map.put("zsmaa", true);

        HashMap<String, ArrayList<String>> map2 = new HashMap();

        map2.put("hami", new ArrayList<String>(Arrays.asList("a", "b", "c", "d")));
        map2.put("objects", new ArrayList<String>(Arrays.asList("amr", "basem", "cat", "door")));

        HashMap<String, ArrayList<Article>> map3 = new HashMap();

        map3.put("A1", new ArrayList<Article>(Arrays.asList(
                new Article("livre", 15, 55.6),
                new Article("car", 20, 30.88),
                new Article("toto", 20, 30.88))));
        
        
              

        

        for (String s : map2.keySet()) {
            //System.out.println(map2.get(s));
            // System.out.println(s);

        }
//{nom,amr}
//
//        for (ArrayList<Article> s : map3.values()) {
//            for(Article a : s ){
//            
//                if (a.getNom().equals("toto")){
//                
//                   // System.out.println(a);
//                }
//            
//            }
//
//        }

        for (Map.Entry kv : map3.entrySet()) {

            //System.out.println(kv);
        }
        for(Map.Entry s : map.entrySet()){
           // System.out.println(s);
        }
        //map.remove("amr");
        for(Map.Entry s : map.entrySet()){
            //System.out.println(s);
        }
        //---------------------------------------------------------------------------------------------------
        
          TreeMap<String, Boolean> Tmap = new TreeMap(new Comparator<String>() {
            
            
            public int compare(String o1, String o2) {
                
            return o1.compareTo(o2);

            }
        });
          
        Tmap.put("yami", true);
  
        Tmap.put("hami", true);
        Tmap.put("amr", false);
        Tmap.put("zami", true);

        TreeMap<String, ArrayList<String>> Tmap2 = new TreeMap();

        Tmap2.put("hami", new ArrayList<String>(Arrays.asList("a", "b", "c", "d")));
        Tmap2.put("objects", new ArrayList<String>(Arrays.asList("amr", "basem", "cat", "door")));

       
        
        //-------------------------------------------
        TreeMap <String ,Article> Tmap4 = new TreeMap();
        Tmap4.put("a", new Article("livre", 150, 55.6));
                Tmap4.put("b", new Article("livre", 20, 55.6));
                        Tmap4.put("c", new Article("Car", 60, 55.6));

                        for(Map.Entry s:Tmap4.entrySet() ){
                            System.out.println(s);
                        
                        }
        
        
        TreeMap<String, ArrayList<Article>> Tmap3 = new TreeMap();

        Tmap3.put("A1", new ArrayList<Article>(Arrays.asList(
                new Article("livre", 15, 55.6),
                new Article("car", 20, 30.88),
                new Article("toto", 20, 30.88))));
        
        
       for(Map.Entry s : map.entrySet()){
       
          // System.out.println(s);
       } 
       for(Map.Entry s : Tmap.entrySet()){
       
           //System.out.println("Tree    "+s);
       } 
        
        
        

    }

}
