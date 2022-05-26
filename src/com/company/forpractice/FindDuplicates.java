package com.company.forpractice;

public class FindDuplicates {
    public static void main(String[] args) {
        checker("How many duplicates are there?");
    }

    public static void checker(String sentence) {
        System.out.println("ORIGINAL SENTENCE: " + sentence);

        String characters = "";
        String duplicates = "";
        for(int i = 0; i < sentence.length() ; i++) {
            String current = Character.toString(sentence.charAt(i));

            if(characters.contains(current)) {
                if(!duplicates.contains(current)) {
                    duplicates += current;
                }
            }

            characters += current;
        }
        System.out.println("DUPLICATES: " + duplicates);
        System.out.println("CHARACTERS: " + characters);
    }
}
