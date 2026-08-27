package ru.aston.hometask_3.builder.model;

public class PersonalComputer {
    private final String motherboard;
    private final String cpu;
    private final String gpu;
    private final String ram;
    private final String hardDrive;
    private final String powerSupply;
    private final String computerCase;
    private final String monitor;
    private final String mouse;
    private final String keyboard;

    public PersonalComputer(String motherboard,
                            String cpu,
                            String gpu,
                            String ram,
                            String hardDrive,
                            String powerSupply,
                            String computerCase,
                            String monitor,
                            String mouse,
                            String keyboard) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.powerSupply = powerSupply;
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getComputerCase() {
        return computerCase;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getMouse() {
        return mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return "Computer specs:\n" +
                "\tmother board: " + motherboard + "\n" +
                "\tcpu: " + cpu + "\n" +
                "\tgpu: " + gpu + "\n" +
                "\tram: " + ram + "\n" +
                "\thard drive: " + hardDrive + "\n" +
                "\tpower suply: " + powerSupply + "\n" +
                "\tcomputer case: " + computerCase + "\n" +
                "\tmonitor: " + monitor + "\n" +
                "\tmouse: " + mouse + "\n" +
                "\tkeyboard: " + keyboard + "\n";

    }
}
