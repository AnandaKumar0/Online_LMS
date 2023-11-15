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
 * @author Ananda Kumar
 */
public class connectionazure {
     public static void main(String[] args) {
        String url = "jdbc:mysql://xampp-mysql.mysql.database.azure.com:3306/library_db";
        String user = "anand";
        String password = "Hema@26kumar";
        
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to Azure MySQL database!");
                // You are now connected to the Azure database.
            }
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}
