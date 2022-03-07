package com.company.interview;

import java.util.Scanner;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        String original, reverse = "";
        int length;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number or string, PALINDROME test!...");
        original = scn.nextLine();
        length = original.length();

        for(int i=length -1; i>= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("REVERSE: " + reverse);

        if(original.equalsIgnoreCase(reverse)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not palindrome.");
        }
    }
}
