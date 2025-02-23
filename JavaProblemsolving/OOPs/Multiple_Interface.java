package JavaProblemsolving.OOPs;

public interface Multiple_Interface {
    public void multipleInterface1();

}

interface child_Multiple_Interface {
    public void multipleInterface2();
}

class MI implements child_Multiple_Interface, Multiple_Interface {
    @Override
    public void multipleInterface1() {
        System.out.println("I am inside interface1");
    }

    @Override
    public void multipleInterface2() {
        System.out.println("I am inside interface2");
    }

}

class MI_main {
    public static void main(String[] args) {
        MI mi = new MI();
        mi.multipleInterface1();
        mi.multipleInterface2();
    }
}