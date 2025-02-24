package JavaProblemsolving.OOPs;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    class Marks {
        private int score;

        public Marks(int score) {
            this.score = score;
        }

        public void displayDetails() {
            System.out.println("Student: " + name + ", Marks: " + score);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Student student = new Student("Kiruthiks");
        Student.Marks marks = student.new Marks(84);
        marks.displayDetails();
    }
}
