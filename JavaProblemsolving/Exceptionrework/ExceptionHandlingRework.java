package JavaProblemsolving.Exceptionrework;

import java.io.*;
import java.util.Scanner;
import java.util.logging.*;

public class ExceptionHandlingRework {

    void arithmeticException(int n) {
        try {
            int i = n / 0;
        } catch (ArithmeticException e) {
            System.out.println(e + " - number is not divisible by zero");
        } finally {
            System.out.println("Finally executed");
        }
    }

    void multipleCatch() {
        try {
            String name = null;

            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (NullPointerException e) {
            System.out.println("Null pointer ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }
    }

    public void throwException() {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
    }

    void customException() {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
    }

    void nestedTryCatch() {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner try error: " + e.getMessage());
            }
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Outer try error: " + e.getMessage());
        }
    }

    public static void loggingException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            Logger logger = Logger.getLogger(ExceptionHandlingRework.class.getName());
            logger.log(Level.SEVERE, "Exception occurred: ", e);
        }
    }

    void multiCatch() {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
        }
    }

    public static void causeException() throws Exception {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            throw new Exception(e);
        }
    }

    public static void checkedException(String filePath) {
        try {
            FileReader file = new FileReader(filePath);
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }

    public static void uncheckedException() {
        int num1 = 10, num2 = 0;
        int result = num1 / num2;
        System.out.println("Result: " + result);
    }

    public static void readFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public static void finallyBlock(String filePath) {
        BufferedReader br = null;
        try {
            FileReader file = new FileReader(filePath);
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

    public static void nullPointerException(String str) {
        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught! The string is null.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionHandlingRework exceptions = new ExceptionHandlingRework();

        exceptions.arithmeticException(10);
        exceptions.multipleCatch();
        exceptions.throwException();
        exceptions.nestedTryCatch();
        loggingException();
        exceptions.multipleCatch();

        try {
            causeException();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        checkedException(
                "C:\\Users\\kirut\\Documents\\GitHub\\Java-Exercises\\JavaProblemsolving\\Exception_handling\\sample2.txt");
        try {
            uncheckedException();
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        }

        readFile("C:\\Users\\kirut\\Downloads\\Country.txt");
        readFile("C:\\Users\\kirut\\Downloads\\Countries.txt");
        finallyBlock(
                "C:\\Users\\kirut\\Documents\\GitHub\\Java-Exercises\\JavaProblemsolving\\Exception_handling\\sample1.txt");
        nullPointerException(null);

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
