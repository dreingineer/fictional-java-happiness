package com.company.advancejava.wildcards;

public class House extends Building{
    public int numberOfRooms = 10;

    public String toString() {
        return "House";
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
