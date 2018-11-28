package com.company;

public class DiagonalMatrix {
  public static void main(String[] args) {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    int[][] theArray = new int[4][4];
    for (int i = 0; i < theArray.length; i++) {
      for (int j = 0; j < theArray[i].length; j++) {
        if (i == j) {
          //theArray[i][j] = 1;   <--- I will get the same result with this one.
          theArray[i][j]++;
        }
        System.out.print(theArray[i][j] + " ");
      }
      System.out.println(" ");
    }
  }
}
