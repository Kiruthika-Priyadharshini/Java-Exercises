package JavaProblemsolving.File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileHandling2 {

    public static void binaryFileHandling(byte[] data) throws IOException {

        Files.write(Paths.get("output_binary.dat"), data);
        byte[] readData = Files.readAllBytes(Paths.get("output_binary.dat"));
        System.out.println("Read binary data" + new String(readData));
    }

    public static void filterFiles(String Path, String extension) {
        File dir = new File(Path);

        FilenameFilter filter = (dir1, name) -> name.endsWith(extension);
        for (String file : dir.list(filter)) {
            System.out.println(file);
        }
    }

    public static void safeFileHandling() {
        try {
            Files.lines(Paths.get("C:\\Users\\kirut\\Downloads\\Countries.txt")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void logToFile(String logFile, String message) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(message);
            writer.newLine();
        }
        Files.lines(Paths.get(logFile)).forEach(System.out::println);

    }

    public static void createTemp() throws IOException {
        File tempFile = File.createTempFile("tempFile", ".txt");
        System.out.println("Temp file created:" + tempFile.getAbsolutePath());
        tempFile.deleteOnExit();
        System.out.println("deleted");
    }

    public static void readEncoding(String Path) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(Path), java.nio.charset.StandardCharsets.UTF_8);
        reader.lines().forEach(System.out::println);

    }

    public static void nioFileHandling(String s, String d, String content) throws IOException {
        Files.write(Paths.get(s), content.getBytes());
        Files.copy(Paths.get(s), Paths.get(d), StandardCopyOption.REPLACE_EXISTING);
        content.lines().forEach(System.out::println);

    }

    public static void modifyRandom(String filePath, long position, String newData) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
        raf.seek(position);
        raf.write(newData.getBytes());
        Files.lines(Paths.get(filePath)).forEach(System.out::println);
    }

    public static void recursiveSearch(File dir, String extension) {
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    recursiveSearch(file, extension);
                } else if (file.getName().endsWith(extension)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // binaryFileHandling(new byte[] { 65, 66, 67 });
        // filterFiles(".", ".txt");
        // safeFileHandling();
        // createTemp();
        // logToFile("logs.txt", "log1");
        // readEncoding("C:\\Users\\kirut\\Downloads\\Countries.txt");
        // nioFileHandling("nio_example.txt", "nio_copy.txt", "NIO Example Content");
        // modifyRandom("C:\\Users\\kirut\\Downloads\\Countries.txt", 6, "WORLD");
        recursiveSearch(new File("."), ".txt");

    }

}
