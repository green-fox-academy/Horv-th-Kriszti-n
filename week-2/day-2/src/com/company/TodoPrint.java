package com.company;

import java.util.ArrayList;

public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        /*ArrayList<String> whatToBuy = new ArrayList<>();
        whatToBuy.add(todoText);
        whatToBuy.add(" - Download games");             <-- This is my solution for the exercise!
        whatToBuy.add(" \t- Diablo");

        for (String listItem: whatToBuy) {    <-- without for loop, it will put your list into squared brackets!
            System.out.println(listItem);
        }*/
        String todoText1 = " - Download games\n";
        String todoText2 = " \t - Diablo";
        System.out.println(todoText + todoText1 + todoText2);
    }
}
