/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmysql;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ananda Kumar
 */
public class BookDAO {
    private Connection connection;
    
    
    public List<Book1> searchBooks(String keyword) {
        List<Book1> books = new ArrayList<>();
        connection=dbcon.getConnection();
        
        try (
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM books WHERE title LIKE ? OR author LIKE ? OR genre LIKE ?")) {

            preparedStatement.setString(1, "%" + keyword + "%");
            preparedStatement.setString(2, "%" + keyword + "%");
            preparedStatement.setString(3, "%" + keyword + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int bookId = resultSet.getInt("book_id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                String description = resultSet.getString("description");

                Book1 book = new Book1(bookId, title, author, genre, description);
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }
    
    
     public List<Book1> getAllBooks() {
        List<Book1> books = new ArrayList<>();

        try (
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM books")) {

            while (resultSet.next()) {
                int bookId = resultSet.getInt("book_id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                String description = resultSet.getString("description");

                Book1 book = new Book1(bookId, title, author, genre, description);
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }
    
    
    
}
