/*
Q11.Wap print table of any no.
*/
import java.util.Scanner;
class Table_for
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.print((i*n)+" ");
		}		
		System.out.println();		
	}

}
