package ru.aston.hometask_3.chain.client;

import ru.aston.hometask_3.chain.api.BankTransferHandler;
import ru.aston.hometask_3.chain.impl.BankCreditCommittee;
import ru.aston.hometask_3.chain.impl.BankDirectory;
import ru.aston.hometask_3.chain.impl.BankManager;
import ru.aston.hometask_3.chain.impl.BankManagment;

public class Main {
    public static void main(String[] args) {
        BankTransferHandler manager = new BankManager();
        BankTransferHandler bankDirector = new BankDirectory();
        BankTransferHandler bankCommittee = new BankCreditCommittee();
        BankTransferHandler bankManagment = new BankManagment();

        manager.setNextHandler(bankDirector).setNextHandler(bankCommittee).setNextHandler(bankManagment);
        manager.handle(101055);
    }
}
