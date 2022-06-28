/*
Q25.Wap enter 5 digit  no and print only even no.
*/
import java.util.Scanner;
class Even_From_number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			if(rem%2==0)
				System.out.print(rem+" ");
		}
			
	}
}
