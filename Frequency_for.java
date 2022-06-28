/*
number frequency
*/
import java.util.Scanner;
class Frequency_for
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		long n,rem;
		System.out.print("Enter big number: ");
		n=sc.nextLong();
		System.out.print("Enter number for finding: ");
		int m=sc.nextInt();
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			if(m==rem)
				c++;
		}
		if(c>0)
			System.out.println("your number found "+c+" times.");
		else
			System.out.println("number is not found.");
				
	}
}
