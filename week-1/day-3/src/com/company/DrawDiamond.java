package com.company;

import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was
    public static void main(String[] args) {
        System.out.print("Please give me a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

    }
    public static void  getDiamond(int inputNumber){
        for (int i = 0; i < inputNumber; i++) {
            for (int j = 0; j <= inputNumber - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int l = inputNumber; l > 0; l--) {
            for (int m = 0; m >= inputNumber - l; m++) {
                System.out.print(" ");
            }
            for (int n = 0; n <= l ; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
