/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptCtr;

import Utils.util;
import java.sql.*;

/**
 *
 * @author 1795162
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
           Connection con = null;
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@144.217.163.57:1521:XE", "oop", "ooppw");
        Statement stm =null;
        stm = con.createStatement();
//        /* primiere execrcies 
//        String sql = "select * from client where noclient >= ? and nomclient like ? ";
//        PreparedStatement stm = con.prepareStatement(sql);
//
//        stm.setInt(1, 30);
//        stm.setString(2, "%L%");
//
//        ResultSet rs = stm.executeQuery();
//         */
//
       
 
      
//        //----------------------------------------------------------------------
// 
////        String sql = "select * from client  ";
////
////        ResultSet rs = stm.executeQuery(sql);
////
////        while (rs.next()) {
////
////            System.out.println(rs.getInt(1) + "  " + rs.getNString(2) + " " + rs.getString(3));
////        }
//
//        //rs.close();
//      
//        con.close();
//
//    }
//

       int num = insertClient(con);
        System.out.println("inserted " + num);
    }
    private static int insertClient(Connection con) throws SQLException {
         String sql = "insert into client values(?,?,?)";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setInt(1, 333);
        stm.setString(2, "Amr");
        stm.setString(3, "01010101001011");
        int num = stm.executeUpdate();
         stm.close();
        return num;
    }

}


