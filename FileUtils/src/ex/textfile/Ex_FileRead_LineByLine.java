package ex.textfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex_FileRead_LineByLine{

    public static void readTextFile(String fileLocation){

        File textFile = new File(fileLocation);
        try {
            String currentLine = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile));
            while ((currentLine = bufferedReader.readLine()) != null){
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}