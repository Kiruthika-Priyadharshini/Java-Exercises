package JavaProblemsolving.Exception_handling;

public class Propagation {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Error in main " + e.getMessage());
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        throw new Exception("Error in method2.");
    }
}
