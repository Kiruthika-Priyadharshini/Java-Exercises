package JavaProblemsolving.Basics;

public class MathOperations_Overloading {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
    static double add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5.5, 10.2));
        System.out.println(add(5.51111, 10.233333));
    }

}
