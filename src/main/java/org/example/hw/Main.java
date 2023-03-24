package org.example.hw;

import org.example.hw.controller.Controller;
import org.example.hw.model.Model;
import org.example.hw.view.UserView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        UserView userView = new UserView(controller);
        SwingUtilities.invokeLater(() -> {
            userView.init();
        });
    }
}
