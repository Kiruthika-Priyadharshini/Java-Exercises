package JavaProblemsolving.Exception_handling;

public class StackTrace {

    public static void main(String[] args) {
        try {

            String str = null;

            System.out.println(str.length());
        } catch (Exception e) {

            System.out.println("An exception occurred: " + e);
            e.printStackTrace();
        }
    }

}
