/*
max number
*/
import java.util.Scanner;
class Max_for
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,c=0,rem;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			if(rem>c)
				c=rem;
		}
		System.out.println("Max number: "+c);
				
	}
}
