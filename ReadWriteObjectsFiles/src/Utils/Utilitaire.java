/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Lists;
import model.ObjectClass;

/**
 *
 * @author AMR
 */
public class Utilitaire {

    public static void afficheInTable(Lists ls, JTable tab1) {

       DefaultTableModel model = (DefaultTableModel) tab1.getModel();
       model.setRowCount(0);
        Object[] list = new Object[14];

        for (ObjectClass o : ls) {
            System.out.println(o);
            list[0] = o.getO1();
            list[1] = o.getO2();
            list[2] = o.getO3();
            list[3] = o.getO4();
            list[4] = o.getO5();
            list[5] = o.getO6();
            list[6] = o.getO7();
            list[7] = o.getO8();
            list[8] = o.getO9();
            list[9] = o.getO10();
            list[10] = o.getO11();
            list[11] = o.getO12();
            list[12] = o.getO13();
            list[13] = o.getO14();
            model.addRow(list);

        }


    }
    
}
