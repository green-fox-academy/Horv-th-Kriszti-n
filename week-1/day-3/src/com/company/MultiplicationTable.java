package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    // Create a program that asks for a number and prints the multiplication table with that number
    //
    // Example:
    // The number 15 should print:
    //
    // 1 * 15 = 15
    // 2 * 15 = 30
    // 3 * 15 = 45
    // 4 * 15 = 60
    // 5 * 15 = 75
    // 6 * 15 = 90
    // 7 * 15 = 105
    // 8 * 15 = 120
    // 9 * 15 = 135
    // 10 * 15 = 150
    public static void main(String[] args) {
        int input = getNumber();
        multiTableResult(input);


    }
    public static int getNumber(){
        System.out.print("Please give me a number: ");
        Scanner inputScanner = new Scanner(System.in);
        int userInput = inputScanner.nextInt();
        return userInput;
    }
    public static void multiTableResult(int userInput){
        int getResult = userInput;
        for (int i = 1; i <= 10; i++) {
            System.out.println(getResult * i);
        }
    }

}
