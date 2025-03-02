package JavaProblemsolving.File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class File_Handling {
    public static void writeFile() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to write to the file:");

        String input = scanner.nextLine();

        FileWriter writer = new FileWriter("output.txt");
        writer.write(input);
        writer.close();
        System.out.println("Data written to the file successfully");
    }

    public static void writeFile_Buffer() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to write to the file:");

        String input = scanner.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write(input);
        writer.close();
        System.out.println("Data written to the file successfully");
    }

    public static void readFile() throws IOException {
        // Path pathFileToRead =
        // Paths.get("C:\\Users\\kirut\\Downloads\\Countries.txt");
        Path pathFileToRead = Paths.get("output.txt");
        List<String> lines = Files.readAllLines(pathFileToRead);
        // System.out.println(lines);

        for (String line : lines) {
            System.out.println(line);
        }

    }

    public static void bufferedReadWrite_copy() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kirut\\Downloads\\Countries.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\kirut\\Downloads\\Countriesout.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();
        System.out.println("Buffered read and write completed successfully");
    }

    public static void appendFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to append file:");
        String input = scanner.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
        writer.write(input);
        writer.newLine();
        writer.close();

        System.out.println("data appended sucessfully");
    }

    public static void handleFileNotFound() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Abs.txt"));
            String line = reader.readLine();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading the file");
        }
    }

    public static void readFileUsingScanner() throws FileNotFoundException {
        File file = new File("C:\\Users\\kirut\\Downloads\\Countries.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void deleteFile() {
        File file = new File("C:\\Users\\kirut\\Downloads\\Countriesout.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File not found");
        }
    }

    public static void listDirectoryContents() {
        File directory = new File("C:\\Users\\kirut\\OneDrive\\Documentos\\python_assignments");
        String[] files = directory.list();
        for (String file : files) {
            System.out.println(file);
        }
    }

    public static void displayFileMetadata() throws IOException {

        File file = new File("C:\\Users\\kirut\\Downloads\\Countries.txt");

        System.out.println("File Name: " + file.getName());
        System.out.println("File Size: " + file.length());

        Date lastModified = new Date(file.lastModified());
        System.out.println("Last Modified: " + lastModified);

        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
        System.out.println("Creation Time: " + attr.creationTime());
        System.out.println("Last Access Time: " + attr.lastAccessTime());

    }

    public static void main(String[] args) throws IOException {
        // writeFile();
        // appendFile();
        // readFile();
        // writeFile_Buffer();
        // bufferedReadWrite();
        // handleFileNotFound();
        // readFileUsingScanner();
        // bufferedReadWrite_copy();
        // deleteFile();
        // listDirectoryContents();
        // displayFileMetadata();

    }
}
