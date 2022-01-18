package com.company.practice;

import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String args[]) {
        WorkingWithStrings wws = new WorkingWithStrings();
        Scanner scan = new Scanner(System.in);
        String str, fname, lname;
        int length;

        System.out.println("Enter your string:");
        str = scan.nextLine();
        length = str.length();
        System.out.println("====================");
        System.out.println("Length of the string is: " + length);
        System.out.println("====================");
        System.out.println("Enter your first name: ");
        fname = scan.nextLine();
        System.out.println("Enter your last name: ");
        lname = scan.nextLine();
        getFullName(fname, lname);
        wws.checkPosition("i have drawn a drawing", "andrei");
    }

    public static void getFullName(String firstname, String lastname) {
        String fullname = firstname.concat(lastname);
        System.out.println("Hi! Your full name is: " + fullname);
        System.out.println(fullname.charAt(1));
        System.out.println(fullname.charAt(11));
    }

    public void checkPosition(String str, String searchString) {
        String s1 = str;
        if(str.contains(searchString)) {
            int position = s1.indexOf(searchString);
            int lastPosition = s1.lastIndexOf(searchString);
            System.out.println(position + " " + lastPosition);
        } else {
            System.out.println(str + " does not contain: " + searchString);
        }
    }

    //substring part of a string; substring is part of a string
    //method use substring
    public void findOutSubString() {
        //implementation of substring....
        //substring(startIndex, endIndex)
        //
    }
}
