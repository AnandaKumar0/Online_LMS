
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ELCOT
 */
public class ConnectMysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     String db_url="jdbc:mysql://xampp.mysql.database.azure.com:3306/library_db?useSSL=true";
    String us="anand";
     String pass="Hema@26kumar";
    
    
        Connection connection=null;
        
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(db_url,us,pass);
            System.out.println("Connection to the Database. ");
        }
        catch(SQLException e){
            System.out.println("Failed to connect to the Database. ");
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    }
    

