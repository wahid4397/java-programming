/* print reverse number*/


import java.util.Scanner;
class Reversenumber
{
	public static void main(String[] args)
	{
		int a,b;
		System.out.print("Enter any number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		while(a>0)
		{
			b=a%10;
			System.out.print("Reverse number "+b);
			a=a/10;
		}
	}
}
