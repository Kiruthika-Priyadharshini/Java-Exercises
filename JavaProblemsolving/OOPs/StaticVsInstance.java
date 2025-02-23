package JavaProblemsolving.OOPs;

public class StaticVsInstance {
    private String name;
    static int age;
    // private int age;

    public String getName() {
        return name;
    }

    public StaticVsInstance(String name, int age) {
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

class Staticclass {

    public static void main(String[] args) {
        StaticVsInstance obj1 = new StaticVsInstance("Kiruthika", 26);
        System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge());
        obj1.setAge(27);
        System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge());

        StaticVsInstance obj2 = new StaticVsInstance("Harish", 28);
        System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge());
        System.out.println("Name: " + obj2.getName() + ", Age: " + obj2.getAge());

    }
}