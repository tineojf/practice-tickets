package logic;

import gui.Login;
import gui.Operation;
import javax.swing.JFrame;

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
}
