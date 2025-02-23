package JavaProblemsolving.OOPs;

public class MethodOverloading {

    static void addition(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    static void addition(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }

    static void addition(double num1, int num2) {
        double sum = num1;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        addition(1, 2);
        addition(2.23, 10);
        addition(1, 2, 3);

    }

}
