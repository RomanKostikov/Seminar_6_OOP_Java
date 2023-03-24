package org.example.hw.model;

import java.util.concurrent.TimeUnit;

/**
 * модель проверки пин-кода с небольшой задержкой
 */
public class Model {
    private int pin = 1234;

    public int getPin() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
