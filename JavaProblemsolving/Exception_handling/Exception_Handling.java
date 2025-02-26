package JavaProblemsolving.Exception_handling;

import java.lang.reflect.Array;
import java.io.IOException;
import java.util.logging.*;

public class Exception_Handling {
    void arithmeticException(int n) {
        try {
            int i = n / 0;
        } catch (ArithmeticException e) {
            System.out.println(e + "number is not divisible by zero");
        } finally {
            System.out.println("Finally executed");
        }
    }

    void multipleCatchExample() {
        try {
            String name = null;
            // System.out.println(name.length());

            int[] arr = new int[2];
            System.out.println(arr[5]);

        } catch (NullPointerException e) {
            System.out.println("Null pointer ");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");

        }
    }

    public void throwExceptionExample() {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older than that");
        }
    }

    void customExceptionExample() {
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

    void nestedTryCatchExample() {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("inner try error" + e.getMessage());
            }
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("outer try error" + e.getMessage());
        }
    }

    public static void loggingExceptionExample() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            Logger logger = Logger.getLogger(Exception_Handling.class.getName());
            logger.log(Level.SEVERE, "Exception occurred: ", e);
        }
    }

    void multiCatchExample() {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("exception" + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Exception_Handling exceptions = new Exception_Handling();

        exceptions.arithmeticException(10);
        exceptions.multipleCatchExample();
        exceptions.throwExceptionExample();
        // exceptions.validateAge(16);
        exceptions.nestedTryCatchExample();
        exceptions.loggingExceptionExample();
        exceptions.multiCatchExample();
    }

}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}