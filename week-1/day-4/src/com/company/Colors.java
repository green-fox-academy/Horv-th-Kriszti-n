package com.company;

public class Colors {
  // - Create a two dimensional array
  //   which can contain the different shades of specified colors
  // - In `colors[0]` store the shades of green:
  //   `"lime", "forest green", "olive", "pale green", "spring green"`
  // - In `colors[1]` store the shades of red:
  //   `"orange red", "red", "tomato"`
  // - In `colors[2]` store the shades of pink:
  //   `"orchid", "violet", "pink", "hot pink"`
  public static void main(String[] args) {
    String colors[][] = new String[3][];
    colors[0] = new String[]{"lime", "forest green", "olive", "pale green", "spring green"};
    colors[1] = new String[]{"orange red", "red", "tomato"};
    colors[2] = new String[]{"orchid", "violet", "pink", "hot pink"};

//    System.out.println("The shades of green: ");
//    for (int i = 0; i < colors[0].length ; i++) {
//      for (int j = 0; j <= colors[i].length; j++) { <--- Tried to printout the elements, but not worked
//
//        System.out.println(colors[0][j]);
//      }
//    }
    //System.out.println("The shades of red: " + colors[1]);
    //System.out.println("The shades of pink: " + colors[2]);


  }

}
