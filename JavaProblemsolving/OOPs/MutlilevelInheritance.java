package JavaProblemsolving.OOPs;

public class MutlilevelInheritance {
    public void family() {
        System.out.println("Grand father");
    }

}

class Father extends MutlilevelInheritance {
    public void family() {
        System.out.println("father");
    }

}

class Child extends MutlilevelInheritance {
    public void family() {
        System.out.println("child");
    }

}

class FamilyMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.family();
        Father father = new Father();
        father.family();

    }

}