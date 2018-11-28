package com.company;

import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        int[] numbers = getNumber();
        int sumValue = getSumValue(numbers);
        float avgValue = getAvgValue(sumValue);
        kiir(sumValue,avgValue);
    }

    public static void kiir(int sumValue, float avgValue) {
        System.out.println("Sum value is: " +sumValue+ " , and the avg value is: " +avgValue);
    }

    public static int[] getNumber(){
        int[] numbers = new int[5];
        for(int i = 0 ; i<5; i++){
            System.out.println("Give me the "+(i+1)+". number:");
            Scanner inputScanner = new Scanner(System.in);
            numbers[i] = inputScanner.nextInt();
        }
        return numbers;
    }

    public static int getSumValue(int[] numbers){
        int sumValue= 0;
        for(int i = 0; i<5;i++){
            sumValue += numbers[i];
        }
        return sumValue;
    }

    public static float getAvgValue(int sumValue) {
        return (float) (sumValue/5.0);
    }
}
