package org.example.module_6.character_stream.text_file;

import java.io.File;
import java.io.IOException;

public class TextFile {
    public static void main(String[] args) throws IOException {
        //File obj=new File("myFile.txt");//create file in root directory
        File obj=new File("java_fswd_sonata/lords_college_java_training/src/main/java/org/example/module_6/character_stream/text_file/myFile1.txt");

        obj.createNewFile();
    }
}
