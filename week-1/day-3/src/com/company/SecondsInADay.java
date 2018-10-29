package com.company;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        currentHours = 50400;
        currentMinutes = 2040;
        currentSeconds = 42;
        int remainingSeconds = 86400;
        int x = remainingSeconds - currentHours - currentMinutes - currentSeconds;
        System.out.println("Remaining seconds from the day:" + x);




    }


}
