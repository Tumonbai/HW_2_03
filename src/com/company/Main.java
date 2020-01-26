package com.company;

public class Main {

    public static void main(String[] args){
	// write your code here
    BankAccount bankAccount = new BankAccount();
    bankAccount.deposit( 10000);
    while (true){
        try {
            System.out.println(bankAccount.withDraw(6000));
            System.out.println(bankAccount.withDraw(bankAccount.Amount));
        }catch (LimitException e){
            e.getMessage();
        break;}
    }
    }
}
