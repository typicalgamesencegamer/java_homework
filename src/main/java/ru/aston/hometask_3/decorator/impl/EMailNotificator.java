package ru.aston.hometask_3.decorator.impl;

import ru.aston.hometask_3.decorator.api.Notificator;

public class EMailNotificator implements Notificator {
    private Notificator notificator;

    public EMailNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    public EMailNotificator() {}
    @Override
    public void send() {
        if (notificator != null) {
            notificator.send();
        }
        System.out.println("Sending email...");
    }
}
