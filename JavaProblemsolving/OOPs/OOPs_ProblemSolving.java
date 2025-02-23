package JavaProblemsolving.OOPs;

public class OOPs_ProblemSolving {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public OOPs_ProblemSolving(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Employee {

    public static void main(String[] args) {
        OOPs_ProblemSolving obj1 = new OOPs_ProblemSolving("Kiruthika", 26);
        System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge());
        obj1.setAge(27);
        System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge());

    }
}