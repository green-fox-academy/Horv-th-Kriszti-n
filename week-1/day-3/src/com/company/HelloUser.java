package com.company;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner name = new Scanner(System.in);
        System.out.println("Please give me your name:");
        String userInput1 = name.nextLine();
        System.out.println("Hello " + userInput1 + "!");
    }
}
