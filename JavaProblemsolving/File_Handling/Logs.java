package JavaProblemsolving.File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Logs {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the date and time in this format
        // yyyy-MM-ddTHH:mm:ss");
        // String targetlog= scanner.nextLine();
        searchLogByTime("2025-04-08T10:30:00");

    }

    public static void searchLogByTime(String targetlog) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kirut\\Downloads\\test10.txt"))) {
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                if (line.startsWith(targetlog)) {
                    System.out.println(line);
                    count++;
                }
            }
            System.out.println("Number of logs matched of same time is:" + count);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file " + e.getMessage());
        }
    }

}
