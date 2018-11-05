package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        String szoveg = "Please give me the distance in  kilometer";
        int userInput1= beker(szoveg);
        kiir(userInput1);
    }

    public static int beker(String kiirasSzoveg){
        Scanner converter = new Scanner(System.in);
        System.out.println(kiirasSzoveg);
        int userInput1 = converter.nextInt();
        return userInput1;
    }

    public static void kiir(int szam){
        System.out.println("Converted to miles");
        System.out.println(szam * 0.62);
    }
}
