package org.example.module_6.character_stream.csv_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("java_fswd_sonata/lords_college_java_training/src/main/java/org/example/module_6/character_stream/csv_file/person.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
