import java.util.*;
public class ekibekipiki
{
	public static void main (String args[])
	{
	
	 Scanner sc = new Scanner(System.in);
	
	 System.out.println("enter a number :");
	 int Number = sc.nextInt();
	
	 if ( Number % 2 == 0) 
	   {
		 System.out.println("this is even number");
	   }
	 else{
		  System.out.println("this is odd number");
	     }
	}
}