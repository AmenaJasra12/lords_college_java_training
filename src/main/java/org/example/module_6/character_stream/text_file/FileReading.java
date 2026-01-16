package org.example.module_6.character_stream.text_file;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) throws IOException {
        String path = "java_fswd_sonata/lords_college_java_training/src/main/java/org/example/module_6/character_stream/text_file/myFile1.txt";

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
        fileReader.close();
    }
}
