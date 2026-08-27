package ru.aston.hometask_3.chain.impl;

import ru.aston.hometask_3.chain.constants.CreditThreshold;
import ru.aston.hometask_3.chain.api.BankTransferHandler;

public class BankDirectory extends BankTransferHandler {
    public BankDirectory() {
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
        if (credit > CreditThreshold.BANKDIRECTORY_THRESHOLD) {
            System.out.println("Директор банка не может одобрить такой кредит");
            return false;
        }
        System.out.println("Директор банка одобрил ваш кредит");
        return true;
    }
}
