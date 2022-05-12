package com.company.novareexam;

import java.util.*;

public class Exam {
    public static void main(String[] args) {
        isPalindrome("madam");
        isPalindrome("laptop");
        isPalindrome("12321");
        bubbleSort(new int[] { 9, 4, 75, 14, 33, 15, 105});
        maxInList();
        checkFizzBuzz(3); //fizz
        checkFizzBuzz(5); //buzz
        checkFizzBuzz(15); //fizzbuzz
        checkFizzBuzz(2); //2
        nextNumUsingFibonacci(new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34});

        String encrpytedMessage =  caesarCipher("andrei java software engineer of novare", 5);
        System.out.println("ENCRYPTED: " + encrpytedMessage);
        System.out.println("DECRYPTED: " + decipher(encrpytedMessage));
    }

    public static void isPalindrome(String input) {
        String original = input, reverse = "";
        int length;
        length = original.length();

        for(int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if(original.equalsIgnoreCase(reverse)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }

    public static void bubbleSort(int[] arrayNum) {
        int length = arrayNum.length;
        System.out.println(length);
        int temp = 0;
        for(int i = 0; i < length; i++) {
            for(int j = 1; j < (length - 1); j++) {
                if(arrayNum[j-1] > arrayNum[j]) {
                    temp = arrayNum[j-1];
                    arrayNum[j-1] = arrayNum[j];
                    arrayNum[j] = temp;
                }
            }
        }

        System.out.println("Bubble sort:");
        for(int elem: arrayNum) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void maxInList() {
        List<Integer> intList = new ArrayList<>();
        intList.add(5674);
        intList.add(50);
        intList.add(12452);
        intList.add(23345);
        System.out.println("Maximum in the list: " + Collections.max(intList));
    }

    public static void checkFizzBuzz(int input) {
        //fizz if multiples of 3
        //buzz if multiples of 5
        //fizzbuzz if multiples if 3 and 5
        //neither return input number
        if(((input % 3) == 0) && ((input % 5) == 0)) {
            System.out.println("fizzbuzz");
        } else if ((input % 3) == 0) {
            System.out.println("fizz");
        } else if((input % 5) == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(input);
        }
    }

    public static void nextNumUsingFibonacci(int[] arrayNum) {
        int numOfElem = arrayNum.length;
        System.out.println(numOfElem);
        int nextElement = numOfElem + 1; //next number index
        System.out.println(nextElement);
        int firstTerm = 0, secondTerm = 1;

        for(int i = 0; i < nextElement- 2 ; i++) { //2 since array is minus 1, added another index to adjust to corrected value
            int newTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = newTerm;
        }

        System.out.println("Next number of given fibonacci sequence of " + Arrays.toString(arrayNum) + " is " + secondTerm);

    }

    public static String caesarCipher(String message, int offset) {
        StringBuilder cipheredMessage = new StringBuilder();
        for(char character : message.toCharArray()) {
            if(character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharater = (char) ('a' + newAlphabetPosition);
                cipheredMessage.append(newCharater);
            } else {
                cipheredMessage.append(character);
            }
        }
        String stringCipheredMessage = cipheredMessage.toString();
//        System.out.println("Original: " + message + "; Ciphered message : "+ stringCipheredMessage);
        return stringCipheredMessage;
    }

    static String decipher(String encrypted) {
        int offset = 5;
        String decrypted = caesarCipher(encrypted, 26 - (offset % 26));
        return decrypted;
    }
}

