import java.util.*;
public class Large{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter A:");
		int A = sc.nextInt();
		
		System.out.println(" enter B :");
		int B = sc.nextInt();
		
		System.out.println(" enter C:");
		int C = sc.nextInt();
		
		if ( A>B && A>C ){
			System.out.println(" A is the Largest number");
		}
		
		else if ( B>C && B>A ){
			System.out.println("B is the Largest number");
		}
		
		else{
			System.out.println("c is the Largest number");
		}
	}
}