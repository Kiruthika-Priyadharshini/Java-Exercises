package JavaProblemsolving.Exception_handling;

public class NullpointerException {
    String str = "";

    public static void NullPointerException(String str) {
        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught! The string is null.");
        }
    }

    public static void main(String[] args) {
        NullPointerException("");

    }

}
