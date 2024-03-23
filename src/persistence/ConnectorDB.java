package persistence;

import java.sql.*;

public class ConnectorDB {

    private static ConnectorDB instance;
    private Connection connection = null;

    private ConnectorDB() {
    }

    public static ConnectorDB getInstance() {
        if (instance == null) {
            instance = new ConnectorDB();
        }
        return instance;
    }

    public Connection getConnection() {

        try {
            String databaseURL = "jdbc:oracle:thin:@localhost:1521:XE";
            String databaseUser = "USER_TINEO";
            String databasePassword = "tineo";

            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(databaseURL, databaseUser, databasePassword);

            System.out.println("Conexión exitosa");
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            return null;
        } catch (IllegalStateException e) {
            System.out.println("Error en la configuración de la base de datos: " + e.getMessage());
            return null;
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}
