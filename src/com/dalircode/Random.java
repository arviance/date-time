package com.dalircode;

public class Random {

    public static void main(String[] args) {
        double randomNumber = getRandomNumber(1, 10);
        System.out.println("The Random Number this time is: " + randomNumber);
    }

    public static double getRandomNumber(double min, double max) {
        double x = (int)((Math.random() * (max - min)) + 1) + min;
        return x;
    }
}
