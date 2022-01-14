package com.company.practice;

import java.util.Random;

public class RandomNumGen {
    public static void main(String args[]) {

        //random object named dice
        Random dice = new Random();
        int number;
        int numbers[] = {1, 2, 3, 4, 5};
        int total = 0;

        for(int i=0; i < 10 ; i++) {
//            number = dice.nextInt(6);
            //generates 0 to 5, dice have 1 to 6 values so,
            number = 1 + dice.nextInt(6);
            System.out.print(number + " ");
        }

        //enhanced for loop
        System.out.println();

        for(int num : numbers) {
            total = total + num;
        }
        System.out.println("Total value of the array: " + total);
    }
}
