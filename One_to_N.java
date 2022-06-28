/*
Q3. Write a program to print all natural numbers from 1 to n. - using while loop
*/
import java.util.Scanner;
class 	One_to_N
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i=1;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(i+" ");
			
			i++;
		}
			
	}
}
