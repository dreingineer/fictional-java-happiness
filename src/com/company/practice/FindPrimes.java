package com.company.practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindPrimes {
    public static void main(String[] args) {

        //dynamic range for finding primes
//        System.out.println(findPrimes(1, 100));
//        System.out.println(findPrimes(50, 70));
//
//        //check palindrome with space handling
//        checkPalindrome("mom");
//        checkPalindrome("nurses run");
//        checkPalindrome("race car");

//        System.out.println(factorialRecursive(5));
        randomAnswer();
    }

    public static ArrayList<Integer> findPrimes(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<Integer>();


        for(int n = start; n < end; n++) { // will iterate from start to end
            boolean prime = true;

            int i = 2; // i started at 2 because 1 is always multiple
            while (i <= n/2) {
                //to check if it is a multiple
                if(n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }

//            System.out.println(prime); //checks n if it is true or false (prime)
            if(prime) {
                primes.add(n); //adds to ArrayList after checking if n is prime
            }
        }
        return primes;
    }

    public static void checkPalindrome(String s) {
        String original = s;
        //sanitize the space to add error handling
        // String is immutable
        String original2 = original.replace(" ", ""); // nurses run is now nursesrun

        String reverse = "";

        for(int i = original2.length() -1; i >= 0; i--) { //laging -1
            reverse += original2.charAt(i);
        }

        System.out.println(original2 + " reverse is " + reverse);
//        System.out.println(original.equals(reverse));
        if(original2.equals(reverse)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }

    public static int factorialRecursive(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n -1);
        }

        //will start with factorial 1 which is 1, and then will go up to n
        // eg n = 5
        // 1 (factorial(1)) * 2; 3 * (2 * 1); 4 * (3 * 2); 5 * 24(4*6);
    }

    public static void randomAnswer() {
        Scanner scan = new Scanner(System.in);

        System.out.println("State your question:");
        scan.next();
        scan.close();

        Random rand = new Random();
        int qnum = rand.nextInt(5);
        System.out.println(qnum);

        switch (qnum) {
            case 1:
                System.out.println("Yes it is. You're lucky.");
                break;
            case 2:
                System.out.println("Signs point to yes");
                break;
            case 3:
                System.out.println("Outlook doesn't look good.");
                break;
            case 4:
                System.out.println("Do not expect too much.");
                break;
            case 5:
                System.out.println("Absolutely not, try again.");
                break;
        }

    }
}
