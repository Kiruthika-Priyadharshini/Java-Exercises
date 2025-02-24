package JavaProblemsolving.OOPs;

class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public void displayAddress() {
        System.out.println("City: " + city + ", State: " + state);
    }
}

class Student {
    private String name;
    private Address address;

    public Student(String name, String city, String state) {
        this.name = name;
        this.address = new Address(city, state);
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        address.displayAddress();
    }
}

public class CompositionStudentExample {
    public static void main(String[] args) {
        Student student = new Student("Kiruthika", "Texas", "TX");
        student.showDetails();
    }
}
