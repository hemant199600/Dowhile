/*
min number
*/
import java.util.Scanner;
class Min_for
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,c,rem;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		c=n;
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			if(rem<c)
				c=rem;
		}
		System.out.println("Minimum number: "+c);
				
	}
}
