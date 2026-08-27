package ru.aston.hometask_3.builder.director;

import ru.aston.hometask_3.builder.api.Builder;

public class Director {
    public Builder createBasicPersonalComputer(Builder builder) {
        builder.setMotherboard("asus motherboard");
        builder.setCpu("intel cpu");
        builder.setGpu("nvidia gpu");
        builder.setRam("kingston ram");
        builder.setHardDrive("kingston hard drive");
        builder.setPowerSupply("deepcool power supply");
        builder.setComputerCase("zalman computer case");
        builder.setMonitor("aoc monitor");
        builder.setMouse("logitech mouse");
        builder.setKeyboard("dexp keyboard");

        return builder;
    };

    public Builder createGamingPersonalComputer(Builder builder) {
        builder.setMotherboard("asus gaming motherboard");
        builder.setCpu("intel gaming cpu");
        builder.setGpu("nvidia gaming gpu");
        builder.setRam("kingston gaming ram");
        builder.setHardDrive("kingston hard drive");
        builder.setPowerSupply("deepcool power supply");
        builder.setComputerCase("zalman gaming computer case");
        builder.setMonitor("aoc gaming monitor");
        builder.setMouse("logitech gaming mouse");
        builder.setKeyboard("razor gaming keyboard");

        return builder;
    }
}
