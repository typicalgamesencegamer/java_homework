package ru.aston.hometask_3.builder.client;

import ru.aston.hometask_3.builder.director.Director;
import ru.aston.hometask_3.builder.impl.PersonalComputerBuilder;
import ru.aston.hometask_3.builder.api.Builder;

public class Main {
    public static void main(String[] args) {
        Builder computerBuilder = new PersonalComputerBuilder();
        Director director = new Director();
        computerBuilder = director.createBasicPersonalComputer(computerBuilder);
        System.out.println(computerBuilder.createPersonalComputer());
        System.out.println("===========================");
        computerBuilder = director.createGamingPersonalComputer(computerBuilder);
        System.out.println(computerBuilder.createPersonalComputer());
    }
}
