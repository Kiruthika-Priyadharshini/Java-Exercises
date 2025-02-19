package JavaProblemsolving.Basics;

public class VariableScope {
    static int globalVar = 10;

    public static void main(String[] args) {
        int localVar = 20;

        System.out.println("Global Variable: " + globalVar);
        System.out.println("Local Variable: " + localVar);

}
}