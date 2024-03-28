package logic.tools;

import gui.Operation;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tools {

    public static void goToOperations(JFrame _panel) {
        _panel.dispose();
        Operation operation = new Operation();
        operation.setVisible(true);
        operation.setLocationRelativeTo(null);
    }

    public static void cleanField(ArrayList<JTextField> _list) {
        for (JTextField item : _list) {
            item.setText("");
        }
    }

    public static boolean verifiedTextNotEmpty(ArrayList<JTextField> _list) {
        for (JTextField item : _list) {
            if (item.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese datos en los campos de texto", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
}
