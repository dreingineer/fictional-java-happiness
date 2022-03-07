package com.company.advancejava.intro_to_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    //changed data type to <T> to accept all types regardless
    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for(T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        System.out.println(charList.get(0));
        System.out.println(intList.get(0));
    }
}
