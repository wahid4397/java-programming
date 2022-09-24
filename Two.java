import java.util.Scanner;
class Two {
	public static void main(String[] args)
	{
	int n1,n2, n3,ch;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter first number");
	n1=input.nextInt();
	System.out.println("Enter second number");
	n2=input.nextInt();
	System.out.println("Select option");
	System.out.println("1.Addition");
	System.out.println("2.Multiplication");
	System.out.println("Enter your choice");
	ch = input.nextInt();
	switch(ch) {
	
	case 1:
		n3=n1+n2;
		System.out.println("Addition = "+n3);
		break;
		
	case 2:
		n3=n1*n2;
		System.out.println("Multiplication = "+n3);
		break;
	}
	
	
	
	
	}

}
