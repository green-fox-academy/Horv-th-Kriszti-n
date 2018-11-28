package com.company;

import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Expected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
  ArrayList<String> girlsAndBoysList = new ArrayList<>();
    for (int i = 0; i < girls.size(); i++) {
    girlsAndBoysList.add(girls.get(i));   // <--- I need a for loop to sort it one by one
    girlsAndBoysList.add(boys.get(i));
    }
    //girlsAndBoysList.addAll(girls);  <--- "addAll" function is just add together two Arraylist, but not sort them one by one!
    //girlsAndBoysList.addAll(boys);        This means that it will put in the first lists elements, then the second lists element in the same order as it was originally.
    return girlsAndBoysList;
  }
}
