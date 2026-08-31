package ru.aston.hometask_3.builder.client;

import ru.aston.hometask_3.builder.model.User;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .setName("John")
                .setEmail("123@email.com")
                .setPassword("12345")
                .build();

        System.out.println(user);
    }
}
