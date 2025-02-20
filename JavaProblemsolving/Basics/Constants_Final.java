package JavaProblemsolving.Basics;

public class Constants_Final {
    final int x = 10;
    final double pi=3.14;

    double area(double radius){
        return pi*radius*radius;
    }

  public static void main(String[] args) {
    // System.out.println("Value of PI: " + pi);

    Constants_Final obj1 = new Constants_Final();
    double area = obj1.area(5.5);
    System.out.printf("Area of the circle is"+ area);

    
    Constants_Final obj2 = new Constants_Final();
    // obj2.x = 25; 
    // System.out.println(obj2.x);
  }


}
