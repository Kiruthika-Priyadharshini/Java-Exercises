package JavaProblemsolving.Collections;

import java.util.*;

class Employee3 {
    int id;
    String name;
    double salary;

    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee3{" + "id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

public class Collections_Exercise {
    public static void main(String[] args) {
        List<Employee3> employees = new ArrayList<>();
        employees.add(new Employee3(3, "A", 60000));
        employees.add(new Employee3(1, "B", 50000));
        employees.add(new Employee3(2, "C", 70000));

        Collections.sort(employees, new Comparator<Employee3>() {
            @Override
            public int compare(Employee3 e1, Employee3 e2) {
                return Integer.compare(e1.id, e2.id);
            }
        });

        System.out.println("Sorted Employee List");
        for (Employee3 emp : employees) {
            System.out.println(emp);
        }

        Iterator<Employee3> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee3 emp = iterator.next();
            if (emp.salary < 60000) {
                iterator.remove();
            }
        }

        for (Employee3 emp : employees) {
            System.out.println(emp);
        }

    }
}
