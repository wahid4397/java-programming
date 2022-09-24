import java.util.Scanner;
class Studentsmarks {
	public static void main(String[] args) {
		
		int sub1,sub2,sub3,sub4,sub5;
		System.out.print("Enter marks of five subject");
		int stud1,stud2,stud3,stud4,stud5;
		System.out.println("Enter five student name");
		Scanner s=new Scanner(System.in);
		sub1=s.nextInt();
		sub2=s.nextInt();
		sub3=s.nextInt();
		sub4=s.nextInt();
		sub5=s.nextInt();
		
		int sum=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total marks "+ sum);
		
		double average=sum/5.0;
		System.out.println("Average marks "+ average);
	
        int marks= 40;
		if(marks >= 40) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
			
		}
			
	}

	
	
	
	

}
