package com.company.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String args[]) {
        HashMap<Integer, String > mp = new HashMap<>();
        mp.put(2, "Saket");
        mp.put(12, "Saurav");
        mp.put(33, "Picci");
        mp.put(25, "Bloom");

        System.out.println("Map size: " + mp.size());
        System.out.println("While loop");

        Iterator itr = mp.entrySet().iterator();

        System.out.println("Iterate hashmap using iterator");
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key is: " + me.getKey() + " Value is: " + me.getValue());
        }

        System.out.println("Using for loop:");
        for(Map.Entry me: mp.entrySet()) {
            System.out.println("Key is: " + me.getKey() + " Value is: " + me.getValue());
        }
    }
}
