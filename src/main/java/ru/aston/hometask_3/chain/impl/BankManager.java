package ru.aston.hometask_3.chain.impl;

import ru.aston.hometask_3.chain.constants.CreditThreshold;
import ru.aston.hometask_3.chain.api.BankTransferHandler;

public class BankManager extends BankTransferHandler {
    public BankManager() {
    }

    @Override
    public BankTransferHandler setNextHandler(BankTransferHandler nextHandler) {
        return super.setNextHandler(nextHandler);
    }

    @Override
    public void handle(int credit) {
        super.handle(credit);
    }

    @Override
    protected boolean canApprove(int credit) {
        if (credit > CreditThreshold.MANAGER_THRESHOLD) {
            System.out.println("Менеджер не может одобрить такой кредит");
            return false;
        }
        System.out.println("Менеджер одобрил вам кредит");
        return true;
    }
}
