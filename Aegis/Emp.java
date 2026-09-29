/*Write a Java program to create a class Employee with instance variables name, id, and 
salary. Create a subclass Manager that has an additional variable department. 
Implement a method displayDetails() to print all information.*/
import java.util.*;
class  Emp{
	String name;
	int id;
	double salary;
}
class Manager extends Emp{
	String department;
	
	void getdata(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name :");
		name= sc.nextLine();
		
		System.out.print("enter your Employee id :");
		id=sc.nextInt();
		
		System.out.print("enter your salary :");
		salary=sc.nextDouble();
		
		sc.nextLine();
		System.out.print("enter your department :");
		department=sc.nextLine();	
	}
	void displayDetails(){
		System.out.println("Name :"+name);
        System.out.println("Employee id :"+id);
		System.out.println("Salary :"+salary);
		System.out.println("Department:"+department);
	}
       public static void main (String args[]){
		   Manager m=new Manager();
		   m.getdata();
		   m.displayDetails();
	   }
}
