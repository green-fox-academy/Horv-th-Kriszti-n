package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        try{
            Path source = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(source);
            System.out.println(Files.lines(source).count());
        }catch (Exception e){
            System.out.println("");
        }
    }
}
