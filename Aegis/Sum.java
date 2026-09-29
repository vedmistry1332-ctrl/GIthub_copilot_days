import java.util.*;
public class Sum{
public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("enter the value of a ");
	int A = sc.nextInt();
	
	System.out.print("enter the value of b ");
	int B = sc.nextInt();
	
	int SUM = A+B;
	int SUB = A-B;
	int MUL = A*B;
	double Div = (double)A/B;
	System.out.println("the sum of two numbers is :"+SUM);
	System.out.println("the SUBTRACTION of two numbers is :"+SUB);
	System.out.println("the MULTIPLICATION of two numbers is :"+MUL);
	System.out.println("the DIVISION of two numbers is "+Div);
}
}