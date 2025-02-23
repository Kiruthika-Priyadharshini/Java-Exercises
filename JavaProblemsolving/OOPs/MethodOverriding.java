package JavaProblemsolving.OOPs;

public class MethodOverriding {
    int programmerSalary;

    public MethodOverriding(int programmersalary) {
        this.programmerSalary = programmersalary;

    }

    public void programmer() {
        System.out.println("Im writing a Code for New application");

    }

}

class Childclass extends MethodOverriding {
    public Childclass(int programmerSalary) {
        super(programmerSalary);
    }

    public void Programmer() {
        System.out.println("Im debugging the code for Exisiting application" + programmerSalary);

    }

}

class Overriding {
    public static void main(String[] args) {
        Childclass c = new Childclass(20000);
        c.Programmer();

    }
}
