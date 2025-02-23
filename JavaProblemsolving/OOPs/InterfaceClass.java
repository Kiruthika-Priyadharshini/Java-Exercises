package JavaProblemsolving.OOPs;

public interface InterfaceClass {
    int x = 19;

    public void interface_method1();

    public void interface_method2();

}

class Imp implements InterfaceClass {
    @Override
    public void interface_method1() {
        System.out.println("Hi I am in interface method1" + x);
    }

    public void interface_method2() {
        System.out.println("Hi I am in interface method2");
    }
}

class Interface_Main {
    public static void main(String[] args) {
        Imp i = new Imp();
        // i.x=20;
        i.interface_method1();
        i.interface_method2();

    }

}