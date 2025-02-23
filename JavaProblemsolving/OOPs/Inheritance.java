package JavaProblemsolving.OOPs;

public class Inheritance {
    int programmerSalary;
    int testerSalary;
    int leadSalary;

    public Inheritance(int programmerSalary, int testerSalary, int leadSalary) {
        this.testerSalary = testerSalary;
        this.leadSalary = leadSalary;
        this.programmerSalary = programmerSalary;

    }

    public void Programmer() {
        System.out.println("Programmer Salary is :" + this.programmerSalary);
    }

    public void lead() {
        System.out.println("Lead Salary is :" + this.leadSalary);
    }

    public void tester() {
        System.out.println("Tester Salary is :" + this.testerSalary);
    }
}

class Application extends Inheritance {

    int ProjectManagerSalary;

    public Application(int programmerSalary, int testerSalary, int leadSalary, int ProjectManagerSalary) {
        super(programmerSalary, testerSalary, leadSalary);
        this.ProjectManagerSalary = ProjectManagerSalary;

    }

    public void ProjectManager() {
        System.out.println("Manager Salary is :" + this.ProjectManagerSalary);
    }

}

class Application_main {
    public static void main(String[] args) {
        Application app = new Application(80000, 90000, 100000, 120000);
        app.Programmer();
        app.tester();
        app.lead();
        app.ProjectManager();
    }
}
