/*
Q21.Wap enter an character and check it is vowel or not?
*/
import java.util.*;
class CheckVowel
{
	public static void main(String args[])
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");	
		ch=sc.next().charAt(0);
		if(ch=='A' || ch=='a'|| ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o'|ch=='U' ||ch=='u')
		{
			System.out.println(" Character is a vowel.");	
		}
		else
		{
			System.out.println(" Character is not a vowel.");
		}
	}
}
