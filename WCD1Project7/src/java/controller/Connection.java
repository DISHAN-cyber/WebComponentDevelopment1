package controller;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;

public class Connection {

    private static java.sql.Connection connection;
    private static final String USER = "root";
    private static final String PASSWORD = "shayon5759";
    private static final String DATABASE_NAME = "wcd_db1";

    private static java.sql.Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            if (connection == null) {
                Class.forName("com.mysql.com.cj.jdbc.Driver");
                DriverManager.getConnection("jdbc:mysql://loclhost:3306" + DATABASE_NAME, USER, PASSWORD);
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }  return connection;
    } public static ResultSet search(String query) throws SQLException, ClassNotFoundException{
        ResultSet result = getConnection().createStatement().executeQuery(query);
        return result;
    }
    
} 
