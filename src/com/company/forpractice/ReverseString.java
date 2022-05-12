package com.company.forpractice;

import java.util.Random;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

//        System.out.println(reverse("the quick brown fox jumps over the lazy dog"));
//        addTwoNumbers(5, 10);
//        addUsingInput();
        rollDice();
    }

    public static String reverse(String s) {
        char[] letters = new char[s.length()];
        int letterIndex = 0;

        //reverse and store to letters char array
        for (int i = s.length() -1; i >= 0 ; i--) {
            //System.out.println(s.charAt(i));
            letters[letterIndex] = s.charAt(i);
            letterIndex++; //increment the letterIndex
        }

        //print the reverse string
        //initialize empty string
        String rev = "";
        for(int x = 0; x < letters.length; x++) {
            //System.out.print(letters[x]);
            rev = rev + letters[x]; //concatenate the char to rev string
        }

        return rev;
    }

    public static void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void addUsingInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scan.nextInt();
        System.out.println("Enter second number");
        int second = scan.nextInt();
        int sum = first + second;
        System.out.println("Sum of two numbers: " + sum);
    }

    public static void rollDice() {
        //or random number generator
        Random randNum = new Random();
        int x = randNum.nextInt(6) + 1;
        System.out.println("You rolled: " + x);
    }
}
