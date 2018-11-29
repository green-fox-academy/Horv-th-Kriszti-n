package com.company;

public class DoubleItems {
  // - Create an array variable named `numList`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Double all the values in the array
  public static void main(String[] args) {
    int[] numArray = {3, 4, 5, 6, 7};
    for (int i = 0; i < numArray.length; i++) {
      numArray[i] = numArray[i] * 2;

    }
    for (int i = 0; i < numArray.length; i++) {
      System.out.println(numArray[i]);
    }
  }
}
