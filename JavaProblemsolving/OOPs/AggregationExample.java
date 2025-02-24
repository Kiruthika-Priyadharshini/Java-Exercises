package JavaProblemsolving.OOPs;

class Department_Aggregation {
    String name;

    Department_Aggregation(String name) {
        this.name = name;
    }
}

class College {
    private String collegeName;
    private Department_Aggregation department_Aggregation;

    public College(String collegeName, Department_Aggregation department_Aggregation) {
        this.collegeName = collegeName;
        this.department_Aggregation = department_Aggregation;
    }

    public void display() {
        System.out.println("College: " + collegeName + ", Department: " + department_Aggregation.name);
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Department_Aggregation dept = new Department_Aggregation("Computer Science");
        College college = new College("Clark University", dept);
        college.display();
    }
}
