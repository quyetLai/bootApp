package quyet.example.bootApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=bootDB";
        String username = "sa";
        String password = "1";

        Properties properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
        properties.setProperty("sslVerifyServerCertificate", "false");

        try (Connection connection = DriverManager.getConnection(url, properties)) {
            // Use the connection to perform database operations
            // ...
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
