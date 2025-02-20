package JavaProblemsolving.Operators;

import java.util.Scanner;

public class FloatingPointAndExpressions {
    public static void main(String[] args) {
        double float1 = 0.1 + 0.2;
        double float2 = 0.3;
        System.out.println((Math.abs(float1 - float2) < 0.00001));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a+b+a-b+b));
        scanner.close();

    }

}
