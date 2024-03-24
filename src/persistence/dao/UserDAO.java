package persistence.dao;

import persistence.ConnectorDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import persistence.models.UserModel;

public class UserDAO {

    private static final ConnectorDB connector = ConnectorDB.getInstance();
    private static final Connection connection = connector.getConnection();

    // Get - users
    public static ArrayList<UserModel> getUsers() {
        ArrayList<UserModel> userList = new ArrayList<>();
        String query = "SELECT * FROM CLIENTES";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            while (result.next()) {
                userList.add(new UserModel(
                        String.valueOf(result.getInt("DNI")),
                        result.getString("NOMBRE"),
                        result.getString("PASSWORD"),
                        result.getString("TELEFONO"),
                        result.getString("DIRECCION")
                ));
            }

            return userList;
        } catch (SQLException e) {
            System.out.println("GET error: " + e.getMessage());
            return null;
        }
    }

    // GET - User by id
    public static UserModel getUserID(int id) {
        String query = "SELECT * FROM CLIENTES WHERE DNI = "
                + String.valueOf(id) + " FETCH FIRST 1 ROWS ONLY";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            if (result.next()) {
                UserModel usuario = new UserModel(
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
            System.out.println("GET error: " + e.getMessage());
            return null;
        }
    }

    // GET - only ID
    public static ArrayList<String> getUsersOnlyID() {
        ArrayList<String> userIdList = new ArrayList<>();
        String query = "SELECT DNI FROM CLIENTES";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            while (result.next()) {
                String id = String.valueOf(result.getInt("DNI"));
                userIdList.add(id);
            }

            return userIdList;
        } catch (SQLException e) {
            System.out.println("GET error: " + e.getMessage());
            return null;
        }
    }

    // POST - User
    public static void postUser(UserModel user) {
        String query = "INSERT INTO CLIENTES "
                + "(dni, nombre, password, telefono, direccion) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getDni());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getPhone());
            preparedStatement.setString(5, user.getAddress());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("¡Usuario insertado correctamente!");
            } else {
                System.out.println("Error al insertar el usuario.");
            }
        } catch (SQLException e) {
            System.err.println("POST error: " + e.getMessage());
        }
    }

    // DELETE - User
    public static void deleteUser(int id) {
        UserModel result = UserDAO.getUserID(id);

        if (result != null) {
            String query = "DELETE FROM CLIENTES WHERE dni = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, id);
                int rowsDeleted = preparedStatement.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println("¡Usuario eliminado correctamente!");
                } else {
                    System.out.println("Error al eliminar el usuario.");
                }
            } catch (SQLException e) {
                System.err.println("DELETE error: " + e.getMessage());
            }
        } else {
            System.out.println("El usuario con ID " + id + " no existe.");
        }
    }

    // PUT - User
    public static void updateUser(int id, UserModel user) {
        UserModel result = UserDAO.getUserID(id);

        if (result != null) {
            String query = "UPDATE CLIENTES SET nombre = ?, telefono = ?, direccion = ? WHERE dni = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getPhone());
                preparedStatement.setString(3, user.getAddress());
                preparedStatement.setInt(4, id);

                int rowsUpdated = preparedStatement.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("¡Usuario actualizado correctamente!");
                } else {
                    System.out.println("Error al actualizar el usuario.");
                }
            } catch (SQLException e) {
                System.err.println("UPDATE error: " + e.getMessage());
            }
        } else {
            System.out.println("El usuario con ID " + id + " no existe.");
        }
    }

}
