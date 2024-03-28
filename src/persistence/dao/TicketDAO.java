package persistence.dao;

import persistence.ConnectorDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import persistence.models.TicketModel;

public class TicketDAO {

    private static final ConnectorDB connector = ConnectorDB.getInstance();
    private static final Connection connection = connector.getConnection();

    // GET All
    public static ArrayList<TicketModel> findAll() {
        ArrayList<TicketModel> listDB = new ArrayList<>();
        String query = "SELECT * FROM BILLETES";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            while (result.next()) {
                listDB.add(new TicketModel(
                        String.valueOf(result.getInt("NRO")),
                        String.valueOf(result.getInt("ORIGEN_LUGARID2")),
                        String.valueOf(result.getInt("DESTINO_LUGARID")),
                        result.getDate("FECHA"),
                        result.getTime("HORA").toLocalTime(),
                        String.valueOf(result.getInt("CLIENTES_DNI")),
                        String.valueOf(result.getInt("COMPANIAS_COMPANIAID"))
                ));
            }

            return listDB;
        } catch (SQLException e) {
            System.out.println("GET error: " + e.getMessage());
            return null;
        }
    }

    // GET by ID
    public static TicketModel findByID(int id) {
        String query = "SELECT * FROM BILLETES WHERE NRO = "
                + String.valueOf(id) + " FETCH FIRST 1 ROWS ONLY";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            if (result.next()) {
                TicketModel item = new TicketModel(
                        String.valueOf(result.getInt("NRO")),
                        String.valueOf(result.getInt("ORIGEN_LUGARID2")),
                        String.valueOf(result.getInt("DESTINO_LUGARID")),
                        result.getDate("FECHA"),
                        result.getTime("HORA").toLocalTime(),
                        String.valueOf(result.getInt("CLIENTES_DNI")),
                        String.valueOf(result.getInt("COMPANIAS_COMPANIAID"))
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
        String query = "SELECT NRO FROM BILLETES";

        try {
            ResultSet result = connection.createStatement().executeQuery(query);

            while (result.next()) {
                String id = String.valueOf(result.getInt("NRO"));
                listBD.add(id);
            }

            return listBD;
        } catch (SQLException e) {
            System.out.println("GET error: " + e.getMessage());
            return null;
        }
    }

    // POST
    public static void create(TicketModel ticket) {
        String query = "INSERT INTO BILLETES"
                + " (NRO, ORIGEN_LUGARID2, DESTINO_LUGARID, FECHA, HORA, CLIENTES_DNI, COMPANIAS_COMPANIAID)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, Integer.parseInt(ticket.getId()));
            preparedStatement.setInt(2, Integer.parseInt(ticket.getOrigin()));
            preparedStatement.setInt(3, Integer.parseInt(ticket.getDestination()));
            preparedStatement.setDate(4, new java.sql.Date(ticket.getDate().getTime()));
            preparedStatement.setTime(5, java.sql.Time.valueOf(ticket.getTime()));
            preparedStatement.setInt(6, Integer.parseInt(ticket.getDni()));
            preparedStatement.setInt(7, Integer.parseInt(ticket.getCompany()));

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("¡Ticket  insertado correctamente!");
            } else {
                System.out.println("Error al insertar el ticket.");
            }
        } catch (SQLException e) {
            System.err.println("POST error: " + e.getMessage());
        }
    }

    // DELETE
    public static void delete(int id) {
        TicketModel result = TicketDAO.findByID(id);

        if (result != null) {
            String query = "DELETE FROM BILLETES WHERE NRO = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, id);
                int rowsDeleted = preparedStatement.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println("¡Ticket  eliminado correctamente!");
                } else {
                    System.out.println("Error al eliminar el ticket.");
                }
            } catch (SQLException e) {
                System.err.println("DELETE error: " + e.getMessage());
            }
        } else {
            System.out.println("El ticket con ID " + id + " no existe.");
        }
    }

    // PUT
    public static void update(int id, TicketModel ticket) {
        TicketModel result = TicketDAO.findByID(id);

        if (result != null) {
            String query = "UPDATE BILLETES SET ORIGEN_LUGARID2 = ?, "
                    + "DESTINO_LUGARID = ?, FECHA = ?, HORA = ?, "
                    + "CLIENTES_DNI = ?, COMPANIAS_COMPANIAID = ? WHERE NRO = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, Integer.parseInt(ticket.getOrigin()));
                preparedStatement.setInt(2, Integer.parseInt(ticket.getDestination()));
                preparedStatement.setDate(3, new java.sql.Date(ticket.getDate().getTime()));
                preparedStatement.setTime(4, java.sql.Time.valueOf(ticket.getTime()));
                preparedStatement.setInt(5, Integer.parseInt(ticket.getDni()));
                preparedStatement.setInt(6, Integer.parseInt(ticket.getCompany()));
                preparedStatement.setInt(7, id);

                int rowsUpdated = preparedStatement.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("¡Ticket actualizada correctamente!");
                } else {
                    System.out.println("Error al actualizar el ticket.");
                }
            } catch (SQLException e) {
                System.err.println("UPDATE error: " + e.getMessage());
            }
        } else {
            System.out.println("El ticket con ID " + id + " no existe.");
        }
    }
}
