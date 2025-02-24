package JavaProblemsolving.OOPs;

class Student1 implements Cloneable {
    private String name;
    private int id;

    public Student1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Student Name: " + name + ", ID: " + id);
    }
}

public class CloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student1 s1 = new Student1("Kiru", 11);
        Student1 s2 = (Student1) s1.clone();

        s1.display();
        s2.display();
    }
}