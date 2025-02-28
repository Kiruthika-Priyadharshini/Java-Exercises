package JavaProblemsolving.Exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlockExample {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {

            FileReader file = new FileReader(
                    "C:\\Users\\kirut\\Documents\\GitHub\\Java-Exercises\\JavaProblemsolving\\Exception_handling\\sample1.txt");
            br = new BufferedReader(file);

            System.out.println("File content: " + br.readLine());

            int result = 10 / 0;

        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } finally {

            try {
                if (br != null) {
                    br.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error while closing file: " + e.getMessage());
            }
        }
    }

}
