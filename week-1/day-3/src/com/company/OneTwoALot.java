package com.company;

import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
        int input = getNumber();
        result(input);
    }
    public static int getNumber() {
            Scanner inputScanner = new Scanner(System.in);
            int userInput1 = inputScanner.nextInt();
            return userInput1;
    }
    public static void result(int userInput1){
        if (userInput1 <= 0) {
            System.out.println("Not enough");
        } else if (userInput1 == 1) {
            System.out.println("One");
        } else if (userInput1 == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }
    }
}
