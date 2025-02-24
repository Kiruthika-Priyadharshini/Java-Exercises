package JavaProblemsolving.OOPs;

interface EmployeeActions {
    void work();

    void takeLeave();

    void displaySalary();
}

public class Annonymous {
    public static void main(String[] args) {
        EmployeeActions employee = new EmployeeActions() {
            private double salary = 50000;

            @Override
            public void work() {
                System.out.println("Employee is working hard.");
                salary += 2000;
                System.out.println("Salary after working: " + salary);
            }

            @Override
            public void takeLeave() {
                System.out.println("Employee is taking a leave");
                salary -= 500;
                System.out.println("Salary after taking a leave: " + salary);
            }

            @Override
            public void displaySalary() {
                System.out.println("Employee's current salary: " + salary);
            }
        };

        employee.work();
        employee.takeLeave();
        employee.displaySalary();
    }
}
