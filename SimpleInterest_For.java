/*
calculate SI n Year
*/
import java.util.Scanner;
class SimpleInterest_For
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float p,r,t,temp=1;
		float si=0.0f,sum=0f;
		System.out.print("Enter Principle Amount: ");
		p=sc.nextFloat();
		float tp=p;
		System.out.print("Enter rate            : ");
		r=sc.nextFloat();
		System.out.print("Enter Time            : ");
		t=sc.nextFloat();
		System.out.println("\tYear\tPrinciple Amount\tRate\tSimpleInterest\tTotal Pay");
		System.out.println("\t-----------------------------------------------------------------");
		for(temp=1;temp<=t;temp++)
		{
			si=(tp*r*temp)/100;
			tp=tp+si;
			System.out.println("\t"+Integer.parseInt(temp)+"\t       "+p+"\t\t "+r+"\t    "+si+"\t"+tp);
		}
			System.out.println("\t\t\t\t\t------------------------");
			System.out.println("\t\t\t\t\tTotal Pay = "+tp);
			
	}
}
