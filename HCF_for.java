/*
Q12.Write a program to find HCF (GCD) of two numbers.
*/
import java.util.Scanner;
class HCF_for
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m,hcf=0;
		System.out.print("Enter 2 numbers: ");
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=1;i<=n ||i<=m;i++)
		{
			if(n%i==0 && m%i==0)
			hcf=i;
		}
		System.out.println("Highest Common Factor: "+hcf);
	}
}
