package com.company;

import com.company.userinputs.UserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInput ui = new UserInput();
        String name;
//        ui.showName();
//        ui.addTwoNums();
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        ui.displayMessage(name);
        print();
    }

    //one more method
    //private only accessible in this class which is Main
    private static void print() {
        System.out.println("Hello from private method of Main class!");
    }
}
