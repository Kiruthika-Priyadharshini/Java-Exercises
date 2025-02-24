package JavaProblemsolving.OOPs;

class Employee_1 {
    private String name;
    private int id;

    public Employee_1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee_1 employee = (Employee_1) obj;
        return id == employee.id && name.equals(employee.name);
    }
}

public class ObjectComparision {
    public static void main(String[] args) {
        Employee_1 e1 = new Employee_1("Kiru", 1);
        Employee_1 e2 = new Employee_1("Kiru", 1);
        Employee_1 e3 = e1;

        System.out.println(e1 == e2);
        System.out.println(e1 == e3);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));

    }
}
