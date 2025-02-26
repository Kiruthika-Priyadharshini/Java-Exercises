package JavaProblemsolving.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Streams_array_2_list {
    public static void main(String[] args) {

        List<Employee3> employees = new ArrayList<>();
        employees.add(new Employee3(1, "A", 75000));
        employees.add(new Employee3(2, "B", 50000));
        employees.add(new Employee3(3, "C", 65000));

        System.out.println("Sorting using Lambda Expression based on Salary");
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

        for (Employee3 emp : employees) {
            System.out.println(emp);
        }

        System.out.println("Convert Collection ArrayList to Array and print its elements");
        Employee3[] employeeArray = employees.toArray(new Employee3[0]);

        for (Employee3 emp : employeeArray) {
            System.out.println(emp);
        }

        System.out.println("Streams");
        List<Employee3> filteredEmployees = employees.stream()
                .filter(emp -> emp.salary > 60000)
                .collect(Collectors.toList());

        System.out.println("Salary Greater Than 60000");
        filteredEmployees.forEach(System.out::println);
    }

}
