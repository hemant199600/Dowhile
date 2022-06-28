/*
Q7. Write a program to find sum of all natural numbers between 1 to n.
*/
import java.util.Scanner;
class Sum_1to_n
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		System.out.print("Sum: "+sum);		
			  
	}

}
