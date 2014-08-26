package ex.textfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex_FileRead_LineByLine{

    /**
     * Read the file using a buffered reader and a file reader
     * @param fileLocation
     */
    public static boolean readTextFile(String fileLocation){
        boolean status = false;
        File textFile = new File(fileLocation);
        try {
            String currentLine = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile));
            while ((currentLine = bufferedReader.readLine()) != null){
                System.out.println(currentLine);
                status = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return status;
    }

    public static void main(String[] args) {
        readTextFile("./FileUtils/resources/sample.txt");
    }

}