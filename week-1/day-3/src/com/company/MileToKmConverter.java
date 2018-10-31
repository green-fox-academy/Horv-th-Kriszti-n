package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    Scanner converter = new Scanner(System.in);
        System.out.println("Please give me the distance in kilometer");
        int userInput1 = converter.nextInt();
        System.out.println("Converted to miles");
        System.out.println(userInput1 * 0.62);
    }cd 
}
