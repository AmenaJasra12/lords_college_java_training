package org.example.module_6.character_stream.text_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        String path = "java_fswd_sonata/lords_college_java_training/src/main/java/org/example/module_6/character_stream/text_file/myFile1.txt";
        FileWriter obj = new FileWriter(path);
//        obj.write("Hello World!\nWelcome to File Handling in Java.");
//        obj.write("\nThis is written using FileWriter.");
//        obj.close();
//        System.out.println("Successfully wrote to the file.");

        BufferedWriter bufferedWriter = new BufferedWriter(obj);
        bufferedWriter.write("Hello World!\nWelcome to File Handling in Java.");
        bufferedWriter.write("\nThis is written using FileWriter.");
        bufferedWriter.close();
        System.out.println("Successfully wrote to the file using BufferedWriter.");
    }
}
