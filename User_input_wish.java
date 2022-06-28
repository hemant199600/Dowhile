/*
Q16..WAP to add multiple  number, ask user to take  input as their need. 
   press 0 to terminate inputting after that calculate sum of that inputted number.
*/
import java.util.Scanner;
class User_input_wish
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter numbers: ");
		int n=sc.nextInt();
		System.out.println();
		for(;n!=0;n=sc.nextInt())
		{		
			sum=sum+n;
		}
		System.out.println("Sum: "+sum);
	}
}
