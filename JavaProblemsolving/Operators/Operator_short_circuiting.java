package JavaProblemsolving.Operators;

public class Operator_short_circuiting {
    public static void main(String[] args) {
        int a= 10;
        int b=15;
        boolean shortCircuiting= (a>b)&& false;
        System.out.println(shortCircuiting);
        System.out.println((a<b)||false );
        System.out.println(false &&(a++ >b) );

        
    }
    
    

}
