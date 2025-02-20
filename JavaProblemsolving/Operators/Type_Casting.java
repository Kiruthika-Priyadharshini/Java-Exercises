package JavaProblemsolving.Operators;

public class Type_Casting {
    public static void main(String[] args) {
        int num = 10;
        double result = num / 4;
        double correctResult = num / 4.0; 

        System.out.println(result); 
        System.out.println(correctResult); 
        System.out.println((int)correctResult);

    }
 
}
