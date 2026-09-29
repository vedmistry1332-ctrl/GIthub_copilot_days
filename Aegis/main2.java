/* Write a Java program to create an interface Solid with methods findVolume() and display().
Create two classes Cube and Sphere that implement the Solid interface.
Calculate and display the volume of a cube and a sphere using interface reference variables.*/
// Interface
interface Solid {
    void findVolume();
    void display();
}

// Cube class
class Cube implements Solid {

    double side;
    double volume;

    // Constructor
    Cube(double side) {
        this.side = side;
    }

    // Method to calculate volume
    public void findVolume() {
        volume = side * side * side;
    }

    // Method to display volume
    public void display() {
        System.out.println("Volume of cube is: " + volume);
    }
}

// Sphere class
class Sphere implements Solid {

    double radius;
    double volume;

    // Constructor
    Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate volume
    public void findVolume() {
        volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Method to display volume
    public void display() {
        System.out.println("Volume of sphere is: " + volume);
    }
}

// Main class
public class main2 {
    public static void main(String[] args) {

        // Using interface reference
        Solid s;

        // Cube object
        s = new Cube(3);
        s.findVolume();
        s.display();

        // Sphere object
        s = new Sphere(4);
        s.findVolume();
        s.display();
    }
}