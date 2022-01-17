package com.company.interview;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordsInString {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str;
        System.out.println("Enter sentence, can have duplicate words");
        str = scn.nextLine();

        String[] split = str.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < split.length; i++) {
            if(map.containsKey(split[i])){
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            } else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
}
