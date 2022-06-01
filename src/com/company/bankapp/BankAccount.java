package com.company.bankapp;

import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public BankAccount(String cname, String cid) {
        this.customerName = cname;
        this.customerId = cid;
    }

    void deposit(int amount) {
        if(amount !=0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void  withdraw(int amount) {
        if(amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if(previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transcation Initiated");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("=============================");

        System.out.println("A: Check Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit The System");

        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Enter your option");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            // 11:55 / 20:53 Morioh Java Banking App

            //get the input and set it to option
            option = scanner.next().charAt(0);
            System.out.println("Chosen option: " + option);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Balance = " + balance);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Enter an amount to be deposited");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Get previous transaction");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    getPreviousTransaction();
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("******************************************************************************");
                    System.out.println("you chose EXIT.");
                    System.out.println("******************************************************************************");
                    break;

                default:
                    System.out.println("Invalid Option! Please enter the correct option.");
                    break;
            }

        } while (option != 'E');
            System.out.println("Thank you for using the Java Banking Service!");
    }
}
