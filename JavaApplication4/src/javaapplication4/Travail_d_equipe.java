/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Hakim Mamar, Oleksandr Romaniuk, Amr Seoudy ,Hamidreza Kaveii
package javaapplication4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author 1795680
 */
public class Travail_d_equipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ParseException {

        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@144.217.163.57:1521:XE",
                "hr", "inf5180");
        
        //Les insertions

        insertCountrie(con,"SE","Bengladesh",4);
        insertDepartment(con, 37, "commercial", 111, 1500);
        insertEmployee(con, 209,"Hkm","albert","KIMALBERT","5148887799", Date.valueOf("2006-09-18"),"ST_MAN",25000,0.25,100,50);
        insertJobs(con, "PR_MAN", "Prpfessour", 250000, 600000);
        insertLocation(con ,1050, "Decarie", "h3r j3r", "Montreal", "Qc", "CA");
        insertRegion(con, 321, "north america");
        
        //Les deletes
        
        delete(con, "EMPLOYEES", "EMPLOYEE_ID", 209);
        delete(con, "DEPARTMENTS", "DEPARTMENT_ID", 37);
        delete(con, "JOBS", "JOB_ID", "PR_MAN");
        delete(con, "LOCATIONS", "LOCATION_ID", 1050);
        delete(con, "COUNTRIES", "COUNTRY_ID", "SE");
        delete(con, "REGIONS", "REGION_ID", 321);
      
        //Le select
        
        selectStatement(con, 10);
        
        con.close();
    }

    private static int insertCountrie(Connection con, String id, String nom, int rid) throws SQLException {
        String sql2 = "Insert  into countries values (?,?,?)";
        PreparedStatement stm = con.prepareStatement(sql2);
        stm.setString(1, id);
        stm.setString(2, nom);
        stm.setInt(3, rid);

        int rs = stm.executeUpdate();
        stm.close();
        return rs;
    }

    private static int insertDepartment(Connection con, int id, String nom, int mgid, int lid) throws SQLException {
        String sql2 = "Insert  into departments values (?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(sql2);

        stm.setInt(1, id);
        stm.setString(2, nom);
        stm.setInt(3, mgid);
        stm.setInt(4, lid);

        int rs = stm.executeUpdate();
        stm.close();
        return rs;
    }

    private static int insertEmployee(Connection con, int id, String nom, String prenom, String email,
            String tel, Date hd, String jid, double sal, double com, int mgid, int did) throws SQLException {
        String sql2 = "Insert  into employees values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(sql2);

        stm.setInt(1, id);
        stm.setString(2, nom);
        stm.setString(3, prenom);
        stm.setString(4, email);
        stm.setString(5, tel);
        stm.setDate(6, hd);
        stm.setString(7, jid);
        stm.setDouble(8, sal);
        stm.setDouble(9, com);
        stm.setInt(10, mgid);
        stm.setInt(11, did);

        int rs = stm.executeUpdate();
        stm.close();
        return rs;
    }

    private static int insertJobs(Connection con, String jid, String jtitle, double minsal, double maxsal) throws SQLException {
        String sql2 = "Insert  into jobs values (?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(sql2);

        stm.setString(1, jid);
        stm.setString(2, jtitle);
        stm.setDouble(3, minsal);
        stm.setDouble(4, maxsal);

        int rs = stm.executeUpdate();
        stm.close();
        return rs;
    }

    private static int insertLocation(Connection con, int lid, String add, String pcode, String city, String state, String cid) throws SQLException {
        String sql2 = "Insert  into locations values (?,?,?,?, ?, ?)";
        PreparedStatement stm = con.prepareStatement(sql2);

        stm.setInt(1, lid);
        stm.setString(2, add);
        stm.setString(3, pcode);
        stm.setString(4, city);
        stm.setString(5, state);
        stm.setString(6, cid);

        int rs = stm.executeUpdate();
        stm.close();
        return rs;
    }
    
        private static int insertRegion(Connection con, int rid, String rname ) throws SQLException {
        String sql2 = "Insert  into regions values (?,?)";
        PreparedStatement stm = con.prepareStatement(sql2);

        stm.setInt(1, rid);
        stm.setString(2, rname);

        int rs = stm.executeUpdate();
        stm.close();
        return rs;
    }
        
     public static void delete(Connection con, String table, String column, int id) throws SQLException {
        PreparedStatement stm = null;
        String sql = null;
        sql = "delete from " + table + " where " + column + " = ?  ";
        stm = con.prepareStatement(sql);

        stm.setInt(1, id);

        stm.executeUpdate();
        System.out.println("Deleted");

        stm.close();
    }

    public static void delete(Connection con, String table, String column, String id) throws SQLException {
        PreparedStatement stm = null;
        String sql = null;
        sql = "delete from " + table + " where " + column + " = ?  ";
        stm = con.prepareStatement(sql);

        stm.setString(1, id);

        stm.executeUpdate();
        System.out.println("Deleted");

        stm.close();
    }
    
    public static void selectStatement(Connection con, int no) throws SQLException {

        String sql = "select e.* ,d.DEPARTMENT_NAME ,j.JOB_TITLE from EMPLOYEES e join DEPARTMENTS d on(e.DEPARTMENT_ID =d.DEPARTMENT_ID)\n"
                + " join jobs j on (j.JOB_ID =e.JOB_ID)where d.DEPARTMENT_ID = ? ";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setInt(1, no);
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {

            System.out.println(rs.getObject(1) + " " + rs.getObject(2) + " " + rs.getObject(12) + "  " + rs.getObject(13));

        }
        rs.close();
        stm.close();

        con.close();
    }
}
