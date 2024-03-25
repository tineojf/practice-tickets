package persistence.dao;

import persistence.ConnectorDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import persistence.models.CompanyModel;

public class CompanyDAO {

    private static final ConnectorDB connector = ConnectorDB.getInstance();
    private static final Connection connection = connector.getConnection();

    // GET All
    public static ArrayList<CompanyModel> findAll() {
        ArrayList<CompanyModel> listDB = new ArrayList<>();
        String query = "SELECT * FROM COMPANIAS";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            while (result.next()) {
                listDB.add(new CompanyModel(
                        String.valueOf(result.getInt("COMPANIAID")),
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
    public static CompanyModel findByID(int id) {
        String query = "SELECT * FROM COMPANIAS WHERE COMPANIAID = "
                + String.valueOf(id) + " FETCH FIRST 1 ROWS ONLY";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            if (result.next()) {
                CompanyModel usuario = new CompanyModel(
                        String.valueOf(result.getInt("COMPANIAID")),
                        result.getString("NOMBRE")
                );
                return usuario;
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
        String query = "SELECT COMPANIAID FROM COMPANIAS";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            while (result.next()) {
                String id = String.valueOf(result.getInt("COMPANIAID"));
                listBD.add(id);
            }

            return listBD;
        } catch (SQLException e) {
            System.out.println("GET error: " + e.getMessage());
            return null;
        }
    }

    // POST
    public static void create(CompanyModel company) {
        String query = "INSERT INTO COMPANIAS " + "(COMPANIAID, NOMBRE) " + "VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, company.getId());
            preparedStatement.setString(2, company.getName());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("¡Compañia insertado correctamente!");
            } else {
                System.out.println("Error al insertar la compañia.");
            }
        } catch (SQLException e) {
            System.err.println("POST error: " + e.getMessage());
        }
    }

    // DELETE
    public static void delete(int id) {
        CompanyModel result = CompanyDAO.findByID(id);

        if (result != null) {
            String query = "DELETE FROM COMPANIAS WHERE COMPANIAID = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, id);
                int rowsDeleted = preparedStatement.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println("¡Compañia eliminado correctamente!");
                } else {
                    System.out.println("Error al eliminar la compañia.");
                }
            } catch (SQLException e) {
                System.err.println("DELETE error: " + e.getMessage());
            }
        } else {
            System.out.println("La compañia con ID " + id + " no existe.");
        }
    }

    // PUT
    public static void updateUser(int id, CompanyModel company) {
        CompanyModel result = CompanyDAO.findByID(id);

        if (result != null) {
            String query = "UPDATE COMPANIAS SET NOMBRE = ? WHERE COMPANIAID = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, company.getName());
                preparedStatement.setInt(2, id);

                int rowsUpdated = preparedStatement.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("¡Compañia actualizada correctamente!");
                } else {
                    System.out.println("Error al actualizar la compañia.");
                }
            } catch (SQLException e) {
                System.err.println("UPDATE error: " + e.getMessage());
            }
        } else {
            System.out.println("La compañia con ID " + id + " no existe.");
        }
    }

}
