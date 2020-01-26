package com.company;

public class BankAccount {
    double Amount;

    public BankAccount() {
    }

    public double getAmount() {
        return Amount;
    }

    public void deposit(double sum) {
        Amount += sum;
    }

    public double withDraw(double sum) throws LimitException {
        if (sum > Amount) {
            throw new LimitException("Не достаточна денег для снятие указанной вами сумму" + " " + sum, getAmount());
        } else Amount -= sum;
        return getAmount();
    }
}