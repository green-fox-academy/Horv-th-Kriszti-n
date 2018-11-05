package com.company;

import java.util.Scanner;

public class PublicIndicator {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is excellent!
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    //
    // It should print: Quite cool party!
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people
    public static void main(String[] args) {
        System.out.println("Give me the number of girls:");
        Scanner inputScanner1 = new Scanner(System.in);
        int userInput1 = inputScanner1.nextInt();
        System.out.println("Give me the number of boys:");
        Scanner inputScanner2 = new Scanner(System.in);
        int userInput2 = inputScanner2.nextInt();
        int numberOfGirls = userInput1;
        int numberOfBoys = userInput2;
        if (numberOfGirls == numberOfBoys && numberOfGirls + numberOfBoys >= 20){
            System.out.println("The party is excellent!");
        } else if (numberOfGirls < numberOfBoys && numberOfGirls + numberOfBoys >= 20){
            System.out.println("Quite cool party!");
        } else if ((numberOfGirls + numberOfBoys) < 20 && numberOfGirls >= 1){
            System.out.println("Average party...");
        } else if (numberOfGirls == 0) {
            System.out.println("Sausage party");
        } else {
            System.out.println("this condition is not covered");
        }
    }


}
