package org.example.module_6.character_stream.csv_file;

import com.sun.security.jgss.GSSUtil;
import java.io.*;
import java.util.ArrayList;

public class CsvtoJavaArrayList {
    public static void main(String[] args) throws IOException {
        System.out.println("Reading CSV file and converting to ArrayList of Person objects:");

        ArrayList<person> personArray = new ArrayList<>();

//      personArray = csvFiletoJavaObject(personArray);
//      for (Person person : personArray) {
//          System.out.println("Name: " + person.name + ", Age: " + person.age + ", City: " + person.city);
//      }

        personArray.add(new person("abc", 30, "New York"));
        personArray.add(new person("xyz", 25, "Los Angeles"));
        personArray.add(new person("asdf", 35, "Chicago"));
        personArray.add(new person("asfdsafasdf", 28, "Houston"));

        // write this arraylist to csv file
        String content = "name, age, city\n";
        for (person person : personArray) {
            String line = person.name + ", " + person.age + ", " + person.city;
            content += line + "\n";
        }
        javaObjectToCsvFile(content);

    }

    private static void javaObjectToCsvFile(String content) throws IOException {
        FileWriter fileReader = new FileWriter("java_fswd_sonata/lords_college_java_training/src/main/java/org/example/module_6/character_stream/csv_file/person.csv");
        BufferedWriter bufferedReader = new BufferedWriter(fileReader);

        bufferedReader.write(content);

        bufferedReader.close();
        fileReader.close();
    }

    public static ArrayList<person> csvFiletoJavaObject(ArrayList<person> personArray) throws IOException {
        FileReader fileReader = new FileReader("java_fswd_sonata/lords_college_java_training/src/main/java/org/example/module_6/character_stream/csv_file/person.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int i = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (i == 0) continue; // skip header

            // convert line and store in string array
            String[] arr=line.split(",");

            arr[1] = arr[1].trim();
            person person = new person(arr[0], Integer.parseInt(arr[1]), arr[2]);
            personArray.add(person);

            i++;
        }
        return personArray;
    }
}
