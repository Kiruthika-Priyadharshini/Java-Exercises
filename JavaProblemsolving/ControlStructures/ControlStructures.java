package JavaProblemsolving.ControlStructures;

import java.util.Scanner;

public class ControlStructures {
    public static void CheckPositiveOrNegativeOrZero(int num){
            if (num<0){
                System.out.println("number is negative");
            }else if (num>0){
                System.out.println("The number is positive");
            }else{
                System.out.println("The number is zero");
            }
        }
    
        static void assignGrade(int mark) {
            if (mark >= 90) {
                System.out.println("A");
            } else if (mark >= 80) {
                System.out.println("B");
            } else if (mark >= 70) {
                System.out.println("C");
            } else if (mark >= 60) {
                System.out.println("D");
            } else if (mark >= 60) {
                System.out.println("D");
            }
            else {
                System.out.println("F");
            }
        }
        public static void dayOfWeek(int num){
            switch ((num)) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thurday");
                    break;
                case 5:System.out.println("Friday");
                    break;
                case 6:System.out.println("Saturday");
                    break;
                case 7:System.out.println("Sunday");
                    break;
                default:System.out.println("enter valid");
                    break;
            }
        }
        public static void PrintNumWhile(int num){
            int i =1;
            while (i<=num){
                System.out.println(i);
                i++;
            }    
        }
        static void ValidOrNot(){
            Scanner scanner =  new Scanner(System.in);
            int num;   
            do{
                System.out.println("Enter a valid positive number");
                num=scanner.nextInt();
            }while (num<=0);
            System.out.println("Valid Input");

        }
        static void printMultiples(int num) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d", i, num,num * i).println();
            }
        }
        static void iterateOverString(){
            String[] names = {"kiru", "Haru","Priya","dharshini"};
            for (String i: names ){
                System.out.println(i);
            }

        }
        static void usingBreak(){
            for (int i =0;i<=10; i++){
                if (i==9){
                break;
                }
                System.out.println(i);
            }
        }
        static void continueUsage() {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println( i );
            }
            System.out.println(" ");

        }
        static void conditionalExit(){
            for (int i = 1; i <= 10; i++) {
                System.out.print(i);
                if (i == 7){
                     break;
                }
            }
        }
        static void MultipleConditions(int num){
            if (num>=10 && num<=50){
                System.out.println("The number is between 10 and 50");
            }
        }
        static void switchFallThrough(int num) {
            switch (num) {
                case 1,2,3,4,5:
                    System.out.println("Number is between 1 and 5");
                    break;
                default:
                    System.out.println("Number is something else");
            }
        }
        static void infiniteLoop() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter exit to stop");
                String input = scanner.next();
                if (input.equals("exit")){
                    break;
                }
            }
        }
        static int factorial(int num) {
            int factorial = 1;
            for (int i = num; i >=1; i--) {
                factorial= factorial * i;
            }
            return factorial;
        }

        static boolean isPrimeOrNot(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

    static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d", i,j,i * j).println();
            }
        }
    }

    static int sumArrayUsingForloop(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    static int sumUsingWhileLoop(int[] arr) {
        int sum = 0, i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    static void fibonacci(int limit) {
        int a = 0, b = 1;
        while (a <= limit) {
            System.out.println(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    static void handleException() {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            try {
                System.out.println("Enter a number: ");
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid");
            }
        }
        System.out.println("Valid");
    }


    static void menuDrivenApplication(){
        Scanner scanner =new Scanner(System.in);

        while (true){
            System.out.println("Menu");
            System.out.println("1. Welcome ");
            System.out.println("2. Print numbers ");
            System.out.println("3. Check Even or odd");
            System.out.println("4. Exit");
            System.out.println("Choose any one of the option");

            int choice =scanner.nextInt();

            if (choice >=1 && choice <=4){
                switch(choice){
                    case 1: System.out.println("Hello!");
                        break;
                    case 2: 
                    for (int i =1;i<=5;i++){
                        System.out.println(i);
                    }
                        break;
                    
                    case 3:
                    System.out.println("Enter a number");
                    int num = scanner.nextInt();
                    if (num%2==0){
                        System.out.println("The number is even");
                    }else{
                        System.out.println("The number is odd");
                    }
                        break;

                    case 4: System.out.println("Exited!");
                        break;

                }

            }else{
                System.out.println("Invalid");

            }
           
        }
    } 


        public static void main(String[] args) {
            CheckPositiveOrNegativeOrZero(9); 
            assignGrade(60);
            dayOfWeek(6);
            PrintNumWhile(10);
            ValidOrNot();
            printMultiples(6);
            iterateOverString();
            usingBreak();
            continueUsage();
            conditionalExit();
            MultipleConditions(45);
            switchFallThrough(2);
            infiniteLoop();
            System.out.println(factorial(6));
            System.out.println(isPrimeOrNot(37));
            multiplicationTable();
            fibonacci(15);
            int Arr[]={1,8,9,4,2};
            System.out.println("Sum of Numbers using for loop:"+ sumArrayUsingForloop(Arr));
            System.out.println("Sum of Numbers using while loop:"+ sumUsingWhileLoop(Arr));
            handleException();
            menuDrivenApplication();


    }
    

}
