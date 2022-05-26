package com.company.forpractice;

import java.time.LocalDate;
import java.time.Period;

public class FindDuplicates {
    public static void main(String[] args) {
//        checker("How many duplicates are there?");
        ageCalc(1987, 12, 9);
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

    public static void ageCalc(int year, int mo, int day ) {
        LocalDate today = LocalDate.now();
        LocalDate bday = LocalDate.of(year, mo, day);

        System.out.println("Today: " + today + " Birthday: " + bday);
        int numOfDays = Period.between(bday, today).getDays();
        int numOfMonths = Period.between(bday, today).getMonths();
        int numOfYears = Period.between(bday, today).getYears();
        System.out.println("Years old: " + numOfYears + " , # of months: " + numOfMonths + " , # of days: " + numOfDays);
    }
}
