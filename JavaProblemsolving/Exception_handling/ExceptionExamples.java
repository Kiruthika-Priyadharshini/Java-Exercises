package JavaProblemsolving.Exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExamples {

    public static void checkedException() {
        try {
            FileReader file = new FileReader(
                    "C:\\Users\\kirut\\Documents\\GitHub\\Java-Exercises\\JavaProblemsolving\\Exception_handling\\sample2.txt");
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

    public static void main(String[] args) {

        checkedException();
        try {
            uncheckedException();
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        }
    }

}
