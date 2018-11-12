package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        Path source = Paths.get("my-first.txt");
        List<String> content = new ArrayList<>();
        content.add("Krisztián");
        content.add("Feladat");
        System.out.println(content.size());
        content.add(content.size(), "cica");   // <--- with this command you can write into your file, without rewriting the old content!
        List<String> lines = null;
        try {
            Files.write(source, content);
            lines = Files.readAllLines(source);
        } catch (IOException e){
            System.out.println("Unable to write file: my-file.txt");
        }
        System.out.println(lines);
    }
}
