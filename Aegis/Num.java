import java.util.*;
public class Num{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Number :");
		int Number = sc.nextInt();
	
    	if (Number < 0){
			System.out.println("Number is negetive");
		}
		
		else if(Number > 0 ){
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is zero");
		}
	}
}