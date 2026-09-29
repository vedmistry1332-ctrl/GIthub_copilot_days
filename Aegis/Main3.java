/*an abstract class shape with an abstracxt method area() . derive rectangle and circle class from shape ,
define appropriate data members ,method getvalue() in both class for
 initializing the rectangle and circle shape and override area() method . 
 define main method to display the area of circle and rectangle*/
import java.util.*;

// Abstract class
abstract class Shape {
    abstract void area();   // abstract method
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;
    Scanner sc = new Scanner(System.in);

    // Method to get values
    void getValue() {
        System.out.println("Enter length of rectangle:");
        length = sc.nextDouble();

        System.out.println("Enter width of rectangle:");
        width = sc.nextDouble();
    }

    // Overriding area method
    void area() {
        double rectArea = length * width;
        System.out.println("Area of Rectangle: " + rectArea);
    }
}

// Circle class
class Circle extends Shape {
    double radius;
    Scanner sc = new Scanner(System.in);

    // Method to get values
    void getValue() {
        System.out.println("Enter radius of circle:");
        radius = sc.nextDouble();
    }

    // Overriding area method
    void area() {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.getValue();
        r.area();

        c.getValue();
        c.area();
    }
}