package JavaProblemsolving.Operators;
class Vector {
    int x, y;

    Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }
    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class OperatorOverloading {
    public static void main(String[] args) {
        Vector v1 = new Vector(3, 4);
        Vector v2 = new Vector(1, 2);

        Vector sum = v1.add(v2); 

        System.out.print("Sum of Vectors");
        sum.display();
    }

}
