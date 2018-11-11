package com.company;

import java.util.Scanner;

public class CountrFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        System.out.print("Please give me the first number: ");
        Scanner inputScanner = new Scanner(System.in);
        int userInput1 = inputScanner.nextInt();
        System.out.print("Please give me the second number: ");
        Scanner inputScanner2 = new Scanner(System.in);
        int userInput2 = inputScanner2.nextInt();
        if (userInput2 < userInput1) {
            System.out.print("The second number should be bigger: ");
            Scanner inputScanner3 = new Scanner(System.in);
            userInput2 = inputScanner3.nextInt();
            for (int i = userInput1; i <= userInput2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = userInput1; i <= userInput2; i++) {
                System.out.println(i);
            }
        }
    }
}
