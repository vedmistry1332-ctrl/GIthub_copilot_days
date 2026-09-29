import java.util.*;
public class Voter{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age");
		int AGE = sc.nextInt();
	
    	if (AGE < 1){
			System.out.println("please enter valid data");
		}
		
		else if( AGE >= 18 ){
			System.out.println("you are eligible for voting");
		}
		else {
			System.out.println("sorry , you are not eligible for voting ");
		}
	}
}