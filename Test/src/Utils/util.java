/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1795162
 */
public class util {

    Connection con = null;

    public void getConnection() {

        try {
            Connection con = null;
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@144.217.163.57:1521:XE", "oop", "ooppw");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(util.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(util.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void select(String TableName, String selection) {// noclient,nomclient
        ResultSet rs = null;
        Statement stm = null;
        ResultSetMetaData rsmd = null;
       

        try {
            
           
            stm = con.createStatement();
            String sql = "select " + selection + " from " + TableName;
            rs = stm.executeQuery(sql);
            rsmd = rs.getMetaData();
            int noColumn = rsmd.getColumnCount();

            while (rs.next()) {
                for (int i = 0; i <= noColumn; i++) {
                    System.out.print(rs.getObject(i) + "  ");

                }

            }
            rs.close();
            stm.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(util.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
