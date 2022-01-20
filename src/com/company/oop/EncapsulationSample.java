package com.company.oop;

public class EncapsulationSample {
    public static void main(String args[]) {
        Student s = new Student();
        s.setName("Andrei was set name.");
        System.out.println(s.getName() + " From getter method.");
        //cannot access the attributes of any class directly, without its method.
        // To provide access we use getter and setter.
    }
}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
