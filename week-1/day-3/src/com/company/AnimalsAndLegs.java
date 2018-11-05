package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        int chickenNumber = getNumber("Give me the chicken count.");
        int pigNumber = getNumber("Give me the pig count.");
        int legNumber = countLegs(chickenNumber,pigNumber);
        kiir(legNumber);
    }
    public static int getNumber(String outputText){
        System.out.println(outputText);
        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextInt();
    }

    public static int countLegs(int chickenNumber, int pigNumber){
        int chickenLegCount = 2;
        int pigLegCount = 4;

        int legNumber = (chickenNumber*chickenLegCount) + (pigNumber*pigLegCount);
        return legNumber;
    }

    public static void kiir(int legNumber){
        System.out.println("The number of the legs: "+legNumber);
    }
}
