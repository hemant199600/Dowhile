/*
Q19.Write a progaram to check no is negative or possitive or zero.
*/
import java.util.*;
class Positive_Negative
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		if(n>0)
			System.out.println("number is positive");
		else if(n==0)
			System.out.println("number is 0");
		else
			System.out.println("number is negative");		
	}
}
