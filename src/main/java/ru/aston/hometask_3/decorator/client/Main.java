package ru.aston.hometask_3.decorator.client;

import ru.aston.hometask_3.decorator.impl.ChatApplicationNotificator;
import ru.aston.hometask_3.decorator.impl.EMailNotificator;
import ru.aston.hometask_3.decorator.api.Notificator;
import ru.aston.hometask_3.decorator.impl.SmSNotificator;

public class Main {
    public static void main(String[] args) {
        Notificator notificator = new SmSNotificator(new ChatApplicationNotificator(new EMailNotificator()));
        Notificator notificator2 = new SmSNotificator();
        notificator.send();
        System.out.println("========================");
        notificator2.send();
    }
}
