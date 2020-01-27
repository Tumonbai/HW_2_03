package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        while (true) {
            try {
                System.out.println(bankAccount.getAmount());
                bankAccount.withDraw(3000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println(bankAccount.getAmount()-bankAccount.getAmount());
                break;
            }
        }
    }
}
