/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ELCOT
 */
public class dbcon {
    
    private static final String db_url="jdbc:mysql://xampp.mysql.database.azure.com:3306/library_db?useSSL=true";
    private static final String us="anand";
    private static final String pass="Hema@26kumar";
    
    static Connection getConnection(){
        Connection connection=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        try{
            connection=DriverManager.getConnection(db_url,us,pass);
            System.out.println("Connection to the Azure Database. ");
        }
        catch(SQLException e){
            System.out.println("Failed to connect to the Azure Database. ");
            e.printStackTrace();
        }
        return connection;
    }
    
}
