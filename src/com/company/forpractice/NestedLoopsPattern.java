package com.company.forpractice;

import java.util.Scanner;

public class NestedLoopsPattern {
    public static void main(String[] args) {
        System.out.println("Hi user, how many stars would you like?");
        Scanner scan = new Scanner(System.in);
        int numberOfStars = scan.nextInt();
        makeHalfDiamondPattern(numberOfStars);
    }

    public static void makeHalfDiamondPattern(int size) {
        for(int i = 1; i <= size; i++) { //rows
            for(int j = 0; j < i; j++) { //columns
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = size-1; i > 0; i--) {
            for(int j = 0; j < i; j++) { //columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
