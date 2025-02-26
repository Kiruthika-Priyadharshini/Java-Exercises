package JavaProblemsolving.Exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExceptions {
    public static void main(String[] args) {
        readFile("C:\\Users\\kirut\\Downloads\\Country.txt");
        readFile("C:\\Users\\kirut\\Downloads\\Countries.txt");

    }

    public static void readFile(String fileName) {

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + fileName);
        }
    }
}
