package com.company;

import java.util.*;

public class AppendLetter {
  public static void main(String... args) {
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    // Create a method called "appendA()" that adds "a  " to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }

  public static String appendA(List<String> addAList) {

    for (int i = 0; i < addAList.size(); i++) {
      addAList.set(i, addAList.get(i) + "a");
    }
    return addAList.toString();
  }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"
