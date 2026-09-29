
/*Create a class ElectricityBill with consumer number, name, and units consumed (Rate 8.93 / UNIT). Implement:

A constructor to initialize details.
A method calculateBill() to compute the electricity bill based on unit consumption.
A method display() to show consumer details and bill amount.*/
import java.util.*;

class ElectricityBill {
    int cNum;
    String name;
    double unit;
    double bill;
    double rate = 0.93;

    // Constructor
    ElectricityBill() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:"); 
        name = sc.nextLine();

        System.out.println("Enter Used Unit:");
        unit = sc.nextDouble();

        System.out.println("Enter Your Consumer Number:");
        cNum = sc.nextInt();
    }

    // Method to calculate bill
    void calculateBill() {
        bill = rate * unit;
    }

    // Method to display details
    void display() {
        System.out.println("\n--- Electricity Bill Details ---");
        System.out.println("Name: " + name);
        System.out.println("Consumer Number: " + cNum);
        System.out.println("Used Unit: " + unit);
        System.out.println("Bill Amount: " + bill);
    }

    // Main method
    public static void main(String[] args) {
        ElectricityBill e = new ElectricityBill();
        e.calculateBill();
        e.display();
    }
}