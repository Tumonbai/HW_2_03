package com.company;

public class LimitException extends Exception {
    String message;
    public double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

}
