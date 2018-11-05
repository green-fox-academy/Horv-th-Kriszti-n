package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        int input = getNumber();
        oddEven(input);


    }
    public static int getNumber() {
        System.out.println("Please give me a number:");
        Scanner inputScanner = new Scanner(System.in);
        int userInput1 = inputScanner.nextInt();
        return userInput1;
    }
    public static void oddEven(int inputNumber) {
        if (inputNumber % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
