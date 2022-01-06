package com.company.conditional;

public class Conditions {
    public static void main(String args[]) {
//        System.out.println("Testing new main");
        int score;
        score = 39;

        if(score > 40) {
            System.out.println("You passed!, your score is " + score);
        } else {
            System.out.println("Sorry, you failed, your score is less than 40.");
        }
    }
}
