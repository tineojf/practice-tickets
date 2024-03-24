package persistence.dao;

import persistence.ConnectorDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import persistence.models.User;

public class UserDAO {

    private static final ConnectorDB connector = ConnectorDB.getInstance();
    private static final Connection connection = connector.getConnection();

    // Get - users
    public static ArrayList<User> getUsers() {
        ArrayList<User> userList = new ArrayList<>();
        String query = "SELECT * FROM CLIENTES";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            while (result.next()) {
                userList.add(new User(
                        String.valueOf(result.getInt("DNI")),
                        result.getString("NOMBRE"),
                        result.getString("PASSWORD"),
                        result.getString("TELEFONO"),
                        result.getString("DIRECCION")
                ));
            }

            return userList;
        } catch (SQLException e) {
            System.out.println("Select error: " + e.getMessage());
            return null;
        }
    }

    public static User getUserID(int id) {
        String query = "SELECT * FROM CLIENTES WHERE DNI = " + String.valueOf(id);

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            if (result.next()) {
                User usuario = new User(
                        String.valueOf(result.getInt("DNI")),
                        result.getString("NOMBRE"),
                        result.getString("PASSWORD"),
                        result.getString("TELEFONO"),
                        result.getString("DIRECCION")
                );
                return usuario;
            }

            return null;
        } catch (SQLException e) {
            System.out.println("Select error: " + e.getMessage());
            return null;
        }
    }
}
