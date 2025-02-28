package JavaProblemsolving.Exception_handling;

public class ExceptionChain extends Exception {

    public static void causeException() throws Exception {
        try {

            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {

            throw new Exception(e);
        }
    }

    public static void main(String[] args) {
        try {

            causeException();
        } catch (Exception e) {

            System.out.println("Caught MyCustomException: " + e.getMessage());

        }

    }

}
