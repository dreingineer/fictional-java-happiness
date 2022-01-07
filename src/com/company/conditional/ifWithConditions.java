package com.company.conditional;

public class ifWithConditions {
    public static void main(String args[]) {
        int phy;
        int chem;
        int rating, counter;

        phy = 70;
        chem = 10;
        //&& and
        //|| or

        if(phy > 40 && chem  > 40) {
            System.out.println("You passed the test!");
        } else {
            System.out.println("You failed the test");
        }

        //switch statements
        rating = 3;

        switch(rating) {
            case 0 :
                System.out.println("Highly not recommendable");
                break;
            case 1:
                System.out.println("Not recommendable");
                break;
            case 2:
                System.out.println("Failed");
                break;
            case 3:
                System.out.println("Passed");
                break;
            case 4:
                System.out.println("Recommendable");
                break;
            case 5:
                System.out.println("Highly recommendable");
                break;
        }

        counter = 0;
        //while loop
        while(counter < 5) {
            System.out.println("Using while loop " + counter);
            counter ++;
        }
    }
}
