/*
Q9. Write a program to find sum  and count of all odd numbers between 1 to n.
*/
import java.util.Scanner;
class Sum_Count_Odd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range: ");
		int n=sc.nextInt();
		int sum=0,c=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				c++;
				sum=sum+i;
			}
		}
		System.out.println("Sum  : "+sum);
		System.out.println("Count: "+c);		
			  
	}

}
