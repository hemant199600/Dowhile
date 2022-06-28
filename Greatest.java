/*
Q20.Take two int values from user and print greatest among them.
*/
import java.util.Scanner;
class Greatest
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		a=sc.nextInt();
		System.out.print("Enter second number: ");
		b=sc.nextInt();
		System.out.println("----------------------------");
		if(a>b)
			System.out.println(a+" is greatest");
		if(b>a)
			System.out.println(b+" is greatest");
		
	}
}
