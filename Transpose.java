import java.util.Scanner;

class Transpose {
public static void main(String[] args) {
 int a[][]=new int[2][2];
 Scanner s=new Scanner(System.in);
 System.out.print("Enter array data:\n");
 for(int i=0;i<=1;i++)
 {
	for(int j=0;j<=1;j++) {
		a[i][j]=s.nextInt();
	}
 }
 
	System.out.print("Array matrix:\n");
	for(int i=0;i<=1;i++)
	 {
		for(int j=0;j<=1;j++) {
		System.out.print(a[i][j]+" ");
		}
		System.out.print("\n");
		
	 }

System.out.print("Transpose matrix:\n");
for(int i=0;i<=1;i++)
{
	for(int j=0;j<=1;j++) {
	System.out.print(a[j][i]+" ");
	}
	System.out.print("\n");
	

}
}
}