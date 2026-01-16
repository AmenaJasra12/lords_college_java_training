package org.example.module_6.character_stream.json_file;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {
    public static void main(String[] args) throws IOException {
        FileReader obj = new FileReader("java_fswd_sonata/lords_college_java_training/src/main/java/org/example/module_6/character_stream/json_file/address.json");
        BufferedReader obj2 = new BufferedReader(obj);

        // we can not read json file line by line because of it's different data structure
//        String line;
//        while ((line = obj2.readLine()) != null) {
//            System.out.println(line);
//        }

        ObjectMapper objectMapper = new ObjectMapper();
        Person2 personObj = objectMapper.readValue(obj2, Person2.class);
        System.out.println(personObj.toString());
    }
}