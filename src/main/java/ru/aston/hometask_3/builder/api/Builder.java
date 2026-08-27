package ru.aston.hometask_3.builder.api;

import ru.aston.hometask_3.builder.model.PersonalComputer;

public interface Builder {
    void setMotherboard(String motherboard);
    void setCpu(String cpu);
    void setGpu(String gpu);
    void setRam(String ram);
    void setHardDrive(String hardDrive);
    void setPowerSupply(String powerSupply);
    void setComputerCase(String computerCase);
    void setMonitor(String monitor);
    void setMouse(String mouse);
    void setKeyboard(String keyboard);
    PersonalComputer createPersonalComputer();
}
