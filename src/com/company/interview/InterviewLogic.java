package com.company.interview;

public class InterviewLogic {
    public void reverseString(String str) {
        //reverse using StringBuilder!
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb = sb.reverse(); // string builder methods
        System.out.println("reverse of " + str + " is " + sb);
    }

    public void reverseManually(String str) {
        System.out.println(str);
        char ch[] = str.toCharArray();
        for(int i = ch.length -1; i >=0; i--) {
            System.out.print(ch[i]);
        }
    }
}
