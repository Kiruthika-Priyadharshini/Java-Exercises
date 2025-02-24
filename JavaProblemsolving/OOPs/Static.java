package JavaProblemsolving.OOPs;

public class Static {
    static int num;

    static {
        num = 100;
        System.out.println("Static block");
    }

    static void display() {
        System.out.println(num);
    }
}

class Staticmain {
    public static void main(String[] args) {
        Static.display();
        Static.display();
    }
}
