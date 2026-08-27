package ru.aston.hometask_3.chain.impl;

import ru.aston.hometask_3.chain.constants.CreditThreshold;
import ru.aston.hometask_3.chain.api.BankTransferHandler;

public class BankManagment extends BankTransferHandler {
    public BankManagment() {
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
        if (credit > CreditThreshold.BANKSMANAGMENT_THRESHOLD) {
            System.out.println("Банк не может одобрить такой кредит");
            return false;
        }
        System.out.println("Банк одобрил вам кредит");
        return true;
    }
}
