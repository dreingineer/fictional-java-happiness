package com.company.conditional;

public class ConditionAndLoops {
    public static void main(String args[]) {
        //conditional ternary
        int age = 88;
        System.out.println(age > 60 ? "You are old": "Still young...");

        int counter = 0;
        //do while loop
        do {
            //executed first, executed once!
            System.out.println(counter);
            counter++;
        } while(counter < 10); // checks the condition after execution

        if(age >= 60) {
            System.out.println("You are in your 60's or more!");
        } else if(age >= 50) {
            System.out.println("You are in your 50's");
        } else if(age >= 40) {
            System.out.println("You are in your 40's");
        }

        for(int x=0; x < 5; x++) {
            System.out.println("This is a for loop!");
        }

        //nested if
        if(age > 60) {
            if(age > 70 ) {
                System.out.println("You are too old!!!, inside nested if...");
            } else {
                System.out.println("You are now senior citizen");
            }
        } else {
            System.out.println("You are less than 60, not yet a senior citizen");
        }
    }
}
