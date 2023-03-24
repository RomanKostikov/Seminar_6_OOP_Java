package org.example.hw.controller;

import org.example.hw.model.Model;

/**
 * Контроллер выполняет действие по вызову модели,
 * тем самым извлекая необходимые данные в ответ на запрос
 */
public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public boolean checkPin(int pin) {
        return model.getPin() == pin;
    }
}
