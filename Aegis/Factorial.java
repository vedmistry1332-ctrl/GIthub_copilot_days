import java.util.*;
public class Factorial{
	public static void main(String args[]){
		 
	    Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Number:- ");
		int n = sc.nextInt();
		
		int Fact=1;
		for(int i=1;i<=n;i++){
			Fact = Fact*i;
		}
		System.out.println("Factorial = " + Fact);
		
	}
}