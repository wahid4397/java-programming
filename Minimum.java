import java.util.Scanner;
class Minimum {
	public static void main(String[] args) {
		
		int a[]=new int[10]; int min;
		Scanner s=new Scanner(System.in);
		System.out.print("enter array element");
		for(int i=0;i<10; i++)
		{
			a[i]=s.nextInt();
		}
		min=a[0];
		
		for(int i=1 ; i<10 ; i++)
		{
			if (a[i] < min)
			{
				min=a[i];
			}
		}
		System.out.print("minimum element "+min);
	}
	

}
