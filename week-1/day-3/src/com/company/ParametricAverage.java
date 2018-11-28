package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ParametricAverage {
  // Write a program that asks for a number.
  // It would ask this many times to enter an integer,
  // if all the integers are entered, it should print the sum and average of these
  // integers like:
  //
  // Sum: 22, Average: 4.4
  public static void main(String[] args) {
  int[] numbers = getNumber();
  int sumValue = getSum(numbers);
  float averageValue = getAverage(sumValue);
    System.out.println("Sum: " + sumValue + ", Average: " + averageValue);

  }

  public static int[] getNumber() {
    int[] numbers = new int[7];
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Please give the " + (i + 1) + ". number: ");
      Scanner input = new Scanner(System.in);
      numbers[i] = input.nextInt();
    }
    return numbers;
  }
  public static int getSum(int[] numbers) {
    int value = 0;
    for (int i = 0; i < numbers.length; i++) {
      value += numbers[i];
    }
    return value;
  }
  public static float getAverage(int sumValue) {
    return (float) (sumValue / 7.0);
  }
}
