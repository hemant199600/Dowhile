/*
Q18.Wap to find factorial of a no.
*/
import java.util.Scanner;
class Factorial_for
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int fact=1;
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println();
		for(int i=1;i<=n;i++)
		{		
			fact=fact*i;
		}
		System.out.println("Factorial: "+fact);
	}
}
