package main;

import sql.DrugsQuery;
import java.sql.*;

/**
 * Created by Andrew on 06.03.2017.
 */
public class Connect{
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {
            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return null;
        }
        System.out.println("Oracle JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                                    "system", "123321");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static boolean initConnect(String query){
        Connection con = null;
        Statement stmt = null;
        try {
            con = Connect.getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public static void main(String[] argv){
        DrugsQuery st = new DrugsQuery();
    }
}
