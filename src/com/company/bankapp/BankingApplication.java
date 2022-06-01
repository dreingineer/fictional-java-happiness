package com.company.bankapp;

public class BankingApplication {
    public static void main(String[] args) {

        //create a bank account
        BankAccount andrei = new BankAccount("Andreister", "A00001");

//        andrei.getPreviousTransaction();
        andrei.showMenu();
    }
}
