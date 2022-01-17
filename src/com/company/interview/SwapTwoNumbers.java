package com.company.interview;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x, y, temp;
        System.out.println("Enter first number");
        x = sc.nextInt();
        System.out.println("Enter second number");
        y = sc.nextInt();
        System.out.println("First number: " + x + " second number: " + y);

        temp = x; //1st
        x = y;
        y = temp;

        System.out.println("Swapped! First: " + x + " Second: " + y);

        //swap again without the third variable!
        System.out.println("Swapping back with out third variable");
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Original: " + x + " " + y);
    }
}
