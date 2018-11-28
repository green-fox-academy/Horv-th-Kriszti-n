package com.company;

import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    // write your code here

    HashMap<Integer, String> daysofTheweek = new HashMap<>();
    daysofTheweek.put(1, "Monday");
    daysofTheweek.put(2, "Tuesday");
    daysofTheweek.put(3, "Wednesday");
    daysofTheweek.put(4, "Thursday");
    daysofTheweek.put(5, "Friday");
    daysofTheweek.put(6, "Saturday");
    daysofTheweek.put(7, "Sunday");

    System.out.println(daysofTheweek.get(4));

    HashMap<String, String> engHunDictionary = new HashMap<>();
    engHunDictionary.put("apple", "alma");
    engHunDictionary.put("dog", "kutya");
    engHunDictionary.put("one", "egy");
    engHunDictionary.put("house", "ház");
    engHunDictionary.put("coffee", "kávé");

    System.out.println(engHunDictionary.get("coffee"));


  }
}
