/*
Q4. Write a program to print all natural numbers in reverse (from n to 1). - using 
     while loop
*/
import java.util.Scanner;
class 	N_to_One
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		while(n>=1)
		{
			System.out.println(n+" ");
			
			n--;
		}
			
	}
}
