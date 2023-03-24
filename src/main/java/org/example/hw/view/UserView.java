package org.example.hw.view;

import org.example.hw.controller.Controller;

import javax.swing.*;
import java.awt.*;

/**
 * UserView с добавлением потока(необходимо для реализации 5 секундной задержки)
 */
public class UserView extends JFrame {
    private JTextArea text;
    private JButton sendButton;
    private JLabel info;

    public UserView(Controller controller) {
        this.controller = controller;
    }

    private Controller controller;

    public void init() {
        setSize(400, 300);
        text = new JTextArea();
        sendButton = new JButton("Send");
        info = new JLabel("Info");
        add(text, BorderLayout.CENTER);
        add(sendButton, BorderLayout.SOUTH);
        add(info, BorderLayout.NORTH);
        sendButton.addActionListener(e -> {
            int pin;
            String textPin = this.text.getText();
            text.setText("");
            try {
                pin = Integer.parseInt(textPin);
                info.setText("Got it: " + pin + " Waiting...");
                Thread thread = new Thread(() -> {
                    sendButton.setEnabled(false);
                    boolean result;
                    result = controller.checkPin(pin);
                    String resultMessage;
                    if (result) {
                        resultMessage = "Right";
                    } else {
                        resultMessage = "Wrong, try again";
                    }
                    info.setText(resultMessage);
                    sendButton.setEnabled(true);
                });
                thread.start();
            } catch (NumberFormatException e1) {
                info.setText("Only numbers allowed...");
            }
        });
        setVisible(true);
    }
}
