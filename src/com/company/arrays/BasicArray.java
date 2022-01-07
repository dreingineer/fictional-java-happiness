package com.company.arrays;

public class BasicArray {
    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5}; //new way to declare an array
        int total = 0;

        //loop through the array
        for(int x = 0; x < numbers.length ; x++) {
            total = numbers[x] + total;
            System.out.println("index: " + x + " total: " + total);
        }
        System.out.println("total is: " + total);
        System.out.println(numbers[1]);

        for(int counter=0; counter< numbers.length; counter++) {
            System.out.println(counter + "\t" + numbers[counter]);
        }
    }
}
