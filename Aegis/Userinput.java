import java.util.*;
public class Userinput{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your name");
		String Name = sc.nextLine();
		
		System.out.println("enter your age ");
		int Age = sc.nextInt();
		
		System.out.println("hello mr"+ Name);
		System.out.println("your age is "+ Age);
	}
}
