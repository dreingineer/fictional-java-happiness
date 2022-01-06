package com.company.userinputs;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);
    int x, num1, num2, tot;
    String name;

    public void showInput() {
        System.out.println("Enter value of x");
        x = sc.nextInt();
        System.out.println("You typed :" + x);
    }

    public void showName() {
        System.out.println("Please enter your name: ");
        name = sc.nextLine(); // nextLine gets all string with space
        System.out.println("Hi " + name + " !");
    }

    //increment ++
    //decrement --

    public void addTwoNums() {
        System.out.println("Please enter the first number:");
        num1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        num2 = sc.nextInt();
        tot = num1 + num2;
        System.out.println("Sum of the two numbers: " + tot);
    }

    public void displayMessage(String name) {
        System.out.println("Hello " + name + " , message from new class UserInput.");
    }
}
