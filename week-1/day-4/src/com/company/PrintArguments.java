package com.company;

public class PrintArguments {

    public static void main(String[] args) {
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...
    printParams("first", "second", "third", "fourth");
    }
    public static void printParams(String... input){
    for (String number : input){
        System.out.println(number);
    }
    }
}

