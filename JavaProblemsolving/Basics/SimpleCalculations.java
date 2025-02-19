package JavaProblemsolving.Basics;

import java.util.Scanner;

public class SimpleCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter a number:");
        double num2 = scanner.nextDouble();
        System.out.println((num1 + num2));
        System.out.println((num1 - num2));
        System.out.println((num1 * num2));
        System.out.println((num1 / num2));

        scanner.close();
    }
}
