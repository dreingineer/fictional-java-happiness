package com.company.interview;

import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, num;
        boolean isPrime = true;
        System.out.println("Enter number to check if PRIME");
        num = sc.nextInt();
        for (int i = 2 ; i < num/2; i++) {
            temp = num % i;
            if(temp == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Number " + num + " is prime");
        } else {
            System.out.println("Number " + num + " is not prime");
        }
    }
}
