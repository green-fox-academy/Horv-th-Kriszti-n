package com.company;

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8

    /*int input = userNumber();
    int storedNum = randomNumber();
    randomNumber();                   <---- Other solution with more functions, but something not good here!
    userNumber();
    getNumber(input, storedNum);*/
    int randomNumber = 1 + (int)(Math.random() * 20);
    int userNumber;

    Scanner input = new Scanner(System.in);

    while (userNumber != randomNumber) {
      System.out.println("Try to guess the number: ");
      userNumber = input.nextInt();

      if (userNumber > randomNumber) {
        System.out.println("The stored number is lower");
      } else if (userNumber < randomNumber) {
        System.out.println("The stored number is higher");
      } else {
        System.out.println("Congratulation! You found the number: " + randomNumber);
      }
    }
  }

  /*public static int userNumber(){
    System.out.print("Try to guess the number: ");
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();
    return userInput;
  }
  public static int randomNumber(){
    int randomNum = 10 + (int)(Math.random() * 30);
    return randomNum;
  }                                                             <---- Other solution with more functions, but something is not good in the MAIN!
  public static void getNumber(int userInput, int randomNum) {
    while (userInput != randomNum) {
      if (userInput > randomNum) {
        System.out.println("The stored number is lower");
      } else if (userInput < randomNum) {
        System.out.println("The stored number is higher");
      } else {
        System.out.println("Congratulation! You found the number: " + randomNum);
      }
    }
  }*/
}

