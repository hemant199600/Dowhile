/*
prime number
*/
import java.util.Scanner;
class Prime_For
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,c=0,rem;
		System.out.print("Enter  Given number: ");
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			break;
			
		}
		if(i==n||n==1)
			System.out.println("number is prime. ");
		else
			System.out.println("Number is not prime.");
	
				
	}
}
