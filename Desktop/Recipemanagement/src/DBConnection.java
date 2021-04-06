
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bilal
 */
public class DBConnection {
    static Connection con = null;
    
    
    
    
    
    public static Connection db(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbs.SQLServerDriver");
            String conn = "jdbc:sqlserver://localhost8080:1433; databaseName=register;user=BilalAmir;password=123456";
            con = DriverManager.getConnection(conn);
          
            
            JOptionPane.showMessageDialog(null,"Connection Established");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
}
}
