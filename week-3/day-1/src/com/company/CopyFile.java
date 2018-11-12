package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        String oldFile = "my-oldfile.txt";
        String newFile = "my-multiplelines.txt";
        System.out.println(copyFile(oldFile, newFile));
    }
    public static boolean copyFile (String path, String path2){
        Path copyPath = Paths.get(path);
        Path overwritePath = Paths.get(path2);
        try {
            List<String> content = Files.readAllLines(copyPath);
            Files.write(overwritePath, content);
            return true;
        }catch (IOException e){
            return false;
        }
    }
}
