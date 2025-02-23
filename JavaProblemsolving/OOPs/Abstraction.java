package JavaProblemsolving.OOPs;

abstract class Abstraction {

    abstract void abstract_method();

    public void concrete_method() {
        System.out.println("I am in Concrete method");
    }

}

class Implementation extends Abstraction {
    @Override
    void abstract_method() {
        System.out.println("I am in abstract method");
    }

}

class ImplementationMain {
    public static void main(String[] args) {
        Implementation implement = new Implementation();
        implement.abstract_method();
        implement.concrete_method();
    }

}