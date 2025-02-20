package JavaProblemsolving.Basics;

import java.util.Scanner;

public class Conditionals_if {
    public static void main(String[] args) {
        // Combine basic input and arithmetic operations with a simple 
        // if/else structure. 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount: ");

        double amount = scanner.nextDouble();

        if (amount > 100) {
            amount -= amount * 0.10;
            System.out.println("Discount applied for 10%, your bill is " + amount);
        } else {
            System.out.println("Sorry no discount is applied, you bill is" + amount);
        }

        scanner.close();
    }

}
