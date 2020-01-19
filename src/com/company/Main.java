package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
	// write your code here
    BankAccount bankAccount = new BankAccount();
    bankAccount.deposit( 10000);

    boolean Cach = true;
    while (Cach){
        System.out.println(bankAccount.withDraw(6000));
        System.out.println(bankAccount.withDraw(bankAccount.Amount));
    }
    }
}
