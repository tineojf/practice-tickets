package logic;

import gui.Login;
import gui.Operation;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tools {
    
    public static void goToOperations(JFrame _panel) {
        _panel.dispose();
        Operation operation = new Operation();
        operation.setVisible(true);
        operation.setLocationRelativeTo(null);
    }
    
    public static void goToLogin(JFrame _panel) {
        _panel.dispose();
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
    public static void cleanField(ArrayList<JTextField> _list) {
        for (JTextField item : _list) {
            item.setText("");
        }
    }
}
