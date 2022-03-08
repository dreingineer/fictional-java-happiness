package com.company.advancejava.intro_to_generics;

public class UsingVarargs {

    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};
//        printShoppingList(item1, item2);
//        printShoppingList(item1, item2, item3);
//        printShoppingList(shopping);
//        printShoppingList("Bread", "Milk2", "Eggs", "Bananas");
        printShoppingList("test");
    }

    //using varargs, can accept variable inputs
    public static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST:");
        int num = 1;
        for(String item : items) {
            System.out.println(num + ". " + item);
            num++;
        }
        System.out.println();
    }

    //method overloading
//    public static void printShoppingList(String string1, String string2) {
//        System.out.println("SHOPPING LIST:");
//        System.out.println("1. " + string1);
//        System.out.println("2. " + string2);
//        System.out.println();
//    }
//
//    public static void printShoppingList(String string1, String string2, String string3) {
//        System.out.println("SHOPPING LIST:");
//        System.out.println("1. " + string1);
//        System.out.println("2. " + string2);
//        System.out.println("3. " + string3);
//        System.out.println();
//    }
//
//    public static void printShoppingList(String[] items) {
//        System.out.println("SHOPPING LIST:");
//        int num = 1;
//        for(String item : items) {
//            System.out.println(num + ". " + item);
//            num++;
//        }
//        System.out.println();
//    }
}
