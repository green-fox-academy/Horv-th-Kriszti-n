package com.company;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        System.out.print("Please give me a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        getPyramid(userInput);
    }
    public static void getPyramid(int inputNumber){
        for (int i = 0; i < inputNumber; i++) {
            for (int j = 0; j <= inputNumber - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
