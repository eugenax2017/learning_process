package dicionario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test0 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Youtube Урок Java 187 JDBC 5.
        String userName = "root";
        String password = "root";
        String connectionURL = "jdbc:mysql://localhost:3306/sakila";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(connectionURL, userName, password)) {
            System.out.printf("We're connected to %s", connectionURL);
            connection.close();
        }catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }


    }
}
