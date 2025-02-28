package JavaProblemsolving.Exception_handling;

public class Runtimeexception {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("RuntimeException: " + e.getMessage());

        }
    }

}
