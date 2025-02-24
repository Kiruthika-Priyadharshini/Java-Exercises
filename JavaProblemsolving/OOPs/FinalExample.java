package JavaProblemsolving.OOPs;

final class Employee_details {
    final int salary;

    public Employee_details(int salary) {
        this.salary = salary;
    }

    final void displayDetails() {
        System.out.println("Employee details are fixed");
        System.out.println(salary);
    }
    // void changeSalary(){
    // salary+=1000;
    // }
}
// class Manager extends Employee {}

public class FinalExample {
    public static void main(String[] args) {
        Employee_details emp = new Employee_details(50000);
        emp.displayDetails();
        System.out.println(emp.salary);
        // System.out.println(emp.salary+=100);

    }
}