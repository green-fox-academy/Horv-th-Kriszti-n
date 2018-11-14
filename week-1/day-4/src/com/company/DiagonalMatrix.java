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
            for (int j = 0; j < theArray.length; j++) {
            }   if (i == j){
                theArray[i][j] = 1;
                System.out.println(theArray[i][j]);
                    System.out.println(0);
                }
        }
    }
}
