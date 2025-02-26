package JavaProblemsolving.Exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader_File_Close {

    public static void main(String[] args) {
        readFile("C:\\Users\\kirut\\Downloads\\Countries.txt");
        readFile("C:\\Users\\kirut\\Downloads\\Country.txt");

    }

    public static void readFile(String fileName) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());

        } finally {

            try {
                if (br != null) {
                    br.close();
                    System.out.println("BufferedReader closed");
                }
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader" + e.getMessage());
            }
        }
    }
}