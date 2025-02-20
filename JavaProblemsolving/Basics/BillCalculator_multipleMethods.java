package JavaProblemsolving.Basics;

import java.util.Scanner;

public class BillCalculator_multipleMethods {
    public static void main(String[] args) {
        double billAmount = getInput();
        double finalAmount = calculateTotal(billAmount);
        displayBill(finalAmount); 
    }
    static double getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();


        scanner.close();
        return amount;
    }
    static double calculateTotal(double amount) {
        double tax = amount * 0.10;
        return amount + tax;
    }
    static void displayBill(double total) {
        System.out.println("Your total bill amount is " + total);
    }




}
