package ru.aston.hometask_3.chain.api;

public abstract class BankTransferHandler {
    private BankTransferHandler nextHandler;

    public BankTransferHandler() {}

    public BankTransferHandler setNextHandler(BankTransferHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public void handle(int credit) {
        if (canApprove(credit)) {
            System.out.println("Сумма кредита составляет: " + credit + " денежных едениц");
        }
        else if (nextHandler != null) {
            nextHandler.handle(credit);
        }
        else {
            System.out.println("Сумма кредита превышает порог");
        }
    }

    protected abstract boolean canApprove(int credit);
}
