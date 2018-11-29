package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP addresses.
    // Write a function that returns the GET / POST request ratio.
    List<String> list = new ArrayList<>();
    list = readFile();
    calculateRatio(list);
  }

  public static List<String> readFile() {
    try {
      Path source = Paths.get("log.txt");
      List<String> data = Files.readAllLines(source);
      return data;
    } catch (Exception e) {
      System.out.println("Unable to read file!");
      return null;
    }
  }

  public static void calculateRatio(List<String> readList) {
    int counterGet = 0;
    int counterPost = 0;
    for (int i = 0; i < readList.size(); i++) {
      if (readList.get(i).contains("GET")) {
        counterGet++;
      } else if (readList.get(i).contains("POST")) {
        counterPost++;
      }
    }
    System.out.println("The GET/POST ratio: " + ((double) counterGet / counterPost));
  }
}
