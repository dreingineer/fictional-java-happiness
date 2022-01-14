package com.company.practice;

import java.util.Scanner;

public class EnterNumsAndDisplay {
    public static void main(String args[]) {
        //accepts 5 numbers from the user
        int nums[] = new int[5];
        Scanner scan = new Scanner(System.in);

        for(int x = 0; x < nums.length ; x++) {
            System.out.println("Enter the number to be stored");
            nums[x] = scan.nextInt();
        };

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        };
    }
}
