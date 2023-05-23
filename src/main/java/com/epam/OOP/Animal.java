package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String s = "";
        if (numberOfPaws > 1)
            s = "s";
        String has = "no";
        if (hasFur) {
            has = "a";
        }
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw" + s + " and " + has + " fur.";
    }
}
