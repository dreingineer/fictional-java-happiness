package com.company.practice;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String args[]) {
        //p n r
        //principal, number of years, rate of interest
        //double with decimal
//        double principal;
//        double numOfYears;
//        double rateOfInterest;
//        double simpleInterest;

        double principal, numOfYears, rateOfInterest, simpleInterest;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter principal amount:");
        principal = scan.nextDouble();
        System.out.println("Please enter number of years:");
        numOfYears = scan.nextDouble();
        System.out.println("Enter rate of interest");
        rateOfInterest = scan.nextDouble();

        //formula of simple interest: principal*numOfYears*rateOfInterest/100
        simpleInterest = (principal*numOfYears*rateOfInterest)/100;
        System.out.println("The interest will be: " + simpleInterest + " pesos.");
    }
}
