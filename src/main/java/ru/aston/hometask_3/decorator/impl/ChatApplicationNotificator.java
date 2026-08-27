package ru.aston.hometask_3.decorator.impl;

import ru.aston.hometask_3.decorator.api.Notificator;

public class ChatApplicationNotificator implements Notificator {
    private Notificator notificator;

    public ChatApplicationNotificator() {}

    public ChatApplicationNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    @Override
    public void send() {
        if (notificator != null) {
            notificator.send();
        }
        System.out.println("Sending via chat application...");
    }
}
