package JavaProblemsolving.Basics;

import java.util.Scanner;

public class EscapeFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true){
            System.out.println("Enter text");
            input=scanner.nextLine();
            if (input.equals("exit")){
                System.out.println("exited");
                break;

            }
            System.out.println(input);
        }
        scanner.close();
    }

}
