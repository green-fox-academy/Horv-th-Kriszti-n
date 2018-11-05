package com.company;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Please give me the first number:");
        Scanner inputScanner = new Scanner(System.in);
        int userInput1 = inputScanner.nextInt();
        System.out.println("Please give me the second number:");
        Scanner inputScanner2 = new Scanner(System.in);
        int userInput2 = inputScanner.nextInt();
        if (userInput1 > userInput2) {
            System.out.println("This is the bigger number: " + userInput1);
        } else {
            System.out.println("This is the bigger number: " + userInput2);
        }


    }
}
