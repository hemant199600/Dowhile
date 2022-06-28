/*
Q13.Wap enter your name and print it five times.
*/
import java.util.Scanner;
class Name_5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		System.out.println();
		for(int i=1;i<=5;i++)		
			System.out.print(name+" ");
	}
}
