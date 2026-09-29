import java.util.*;
public class Grade{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter Marks : ");
		int marks=  sc.nextInt();
		//System.out.println("your Marks is : "+ Marks);
		
		if (marks >= 90){
			System.out.println("Grade A");
		}
		else if (marks >= 70){
			System.out.println("Grade B");
		}
		else if (marks >= 50){
			System.out.println("Grade c");
		}
		else if (marks >= 30){
			System.out.println("Grade d");
		}
		else {
			System.out.println ("Better Luck Next Time");
		}
		sc.close();
	}
}