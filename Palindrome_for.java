/*
Q27.WAP tt enter a no and check it is pelindrome or not?
*/
import java.util.Scanner;
class Palindrome_for
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,rev=0;
		System.out.print("Enter number: ");
		int m=sc.nextInt();
		n=m;
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			rev=rev*10+rem;
				
		}
		if(rev==m)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome.");
			
	}
}
