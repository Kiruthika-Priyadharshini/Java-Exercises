package JavaProblemsolving.OOPs;

public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age should be positive!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();

        person.setName("Priya");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

    }
}
