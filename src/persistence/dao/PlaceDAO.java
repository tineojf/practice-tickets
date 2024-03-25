package persistence.dao;

import persistence.ConnectorDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import persistence.models.PlaceModel;

public class PlaceDAO {

    private static final ConnectorDB connector = ConnectorDB.getInstance();
    private static final Connection connection = connector.getConnection();

    // GET All
    public static ArrayList<PlaceModel> findAll() {
        ArrayList<PlaceModel> listDB = new ArrayList<>();
        String query = "SELECT * FROM LUGARES";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            while (result.next()) {
                listDB.add(new PlaceModel(
                        String.valueOf(result.getInt("LUGARID")),
                        result.getString("NOMBRE")
                ));
            }

            return listDB;
        } catch (SQLException e) {
            System.out.println("GET error: " + e.getMessage());
            return null;
        }
    }

    // GET by ID
    public static PlaceModel findByID(int id) {
        String query = "SELECT * FROM LUGARES WHERE LUGARID = "
                + String.valueOf(id) + " FETCH FIRST 1 ROWS ONLY";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            if (result.next()) {
                PlaceModel item = new PlaceModel(
                        String.valueOf(result.getInt("LUGARID")),
                        result.getString("NOMBRE")
                );
                return item;
            }

            return null;
        } catch (SQLException e) {
            System.out.println("GET error: " + e.getMessage());
            return null;
        }
    }

    // GET
    public static ArrayList<String> findOnlyID() {
        ArrayList<String> listBD = new ArrayList<>();
        String query = "SELECT LUGARID FROM LUGARES";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            while (result.next()) {
                String id = String.valueOf(result.getInt("LUGARID"));
                listBD.add(id);
            }

            return listBD;
        } catch (SQLException e) {
            System.out.println("GET error: " + e.getMessage());
            return null;
        }
    }

    // POST
    public static void create(PlaceModel company) {
        String query = "INSERT INTO LUGARES " + "(LUGARID, NOMBRE) " + "VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, company.getId());
            preparedStatement.setString(2, company.getName());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("¡Lugar insertado correctamente!");
            } else {
                System.out.println("Error al insertar el lugar.");
            }
        } catch (SQLException e) {
            System.err.println("POST error: " + e.getMessage());
        }
    }

    // DELETE
    public static void delete(int id) {
        PlaceModel result = PlaceDAO.findByID(id);

        if (result != null) {
            String query = "DELETE FROM LUGARES WHERE LUGARID = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, id);
                int rowsDeleted = preparedStatement.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println("¡Lugar eliminado correctamente!");
                } else {
                    System.out.println("Error al eliminar el lugar.");
                }
            } catch (SQLException e) {
                System.err.println("DELETE error: " + e.getMessage());
            }
        } else {
            System.out.println("El lugar con ID " + id + " no existe.");
        }
    }

    // PUT
    public static void update(int id, PlaceModel company) {
        PlaceModel result = PlaceDAO.findByID(id);

        if (result != null) {
            String query = "UPDATE LUGARES SET NOMBRE = ? WHERE LUGARID = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, company.getName());
                preparedStatement.setInt(2, id);

                int rowsUpdated = preparedStatement.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("¡Lugar actualizado correctamente!");
                } else {
                    System.out.println("Error al actualizar el lugar.");
                }
            } catch (SQLException e) {
                System.err.println("UPDATE error: " + e.getMessage());
            }
        } else {
            System.out.println("El lugar con ID " + id + " no existe.");
        }
    }

}
