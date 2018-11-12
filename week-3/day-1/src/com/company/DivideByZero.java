package com.company;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
        int input = inputNumber();
        getResult(input);
    }
    public static int inputNumber(){
        System.out.print("Please give me a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        return userInput;
    }
    public static void getResult(int userInput){
        try {
        int result = userInput / 10;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail, because the input number was zero!");
        }

    }
}
