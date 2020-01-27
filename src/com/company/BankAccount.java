package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Не достаточна денег для снятие указанной вами сумму" + " " + sum, getAmount());
        } else amount -= sum;
    }
}