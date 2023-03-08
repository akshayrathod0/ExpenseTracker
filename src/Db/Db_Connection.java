package Db;

import java.sql.*;
import javax.swing.JOptionPane;
public class Db_Connection {
    public static Connection conn;
    public static Statement st;
    static{
    try{
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/expence_tracker" + "?useSSL=false", "root", "3306");
      st = conn.createStatement();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
  }
}
