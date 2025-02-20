package JavaProblemsolving.Operators;

public class CompoundExpressions {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 2;
        double result = (a * b + Math.pow(c, 2)) / (b - c + 1);
        System.out.println(result);
    }
}
