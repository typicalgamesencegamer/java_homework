package ru.aston.hometask_3.builder.impl;

import ru.aston.hometask_3.builder.api.Builder;
import ru.aston.hometask_3.builder.model.PersonalComputer;

public class PersonalComputerBuilder implements Builder {
    private String motherboard;
    private String cpu;
    private String gpu;
    private String ram;
    private String hardDrive;
    private String powerSupply;
    private String computerCase;
    private String monitor;
    private String mouse;
    private String keyboard;

    @Override
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    @Override
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    @Override
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public PersonalComputer createPersonalComputer() {
        return new PersonalComputer(motherboard, cpu, gpu, ram, hardDrive, powerSupply, computerCase, monitor, mouse, keyboard);
    }
}
