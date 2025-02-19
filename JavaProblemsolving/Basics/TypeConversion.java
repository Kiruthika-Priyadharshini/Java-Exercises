package JavaProblemsolving.Basics;

public class TypeConversion {

    public static void main(String[] args) {
        int num1 = 100;
        double numdouble = num1;
        System.out.println("Implicit Conversion:" + numdouble);

        double anotherDouble = 9.78;
        int anothernum = (int) anotherDouble;
        System.out.println("Explicit Conversion:" + anothernum);
    }
}
