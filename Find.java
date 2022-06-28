/*
 find the particular number in given number 
*/
import java.util.Scanner;
class Find
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,c=0,rem;
		System.out.print("Enter  Given number: ");
		n=sc.nextInt();
		System.out.print("Enter finding number: ");
		int m=sc.nextInt();
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			if(rem==m)
				c=1;
			n=n/10;
		}while(n!=0);
		if(c==1)
			System.out.println("number is found: ");
		else
			System.out.println("Number is not found.");
	
				
	}
}
