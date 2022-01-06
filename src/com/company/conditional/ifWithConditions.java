package com.company.conditional;

public class ifWithConditions {
    public static void main(String args[]) {
        int phy;
        int chem;

        phy = 70;
        chem = 10;
        //&& and
        //|| or

        if(phy > 40 && chem  > 40) {
            System.out.println("You passed the test!");
        } else {
            System.out.println("You failed the test");
        }
    }
}
