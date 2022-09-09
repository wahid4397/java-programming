import java.util.Scanner;

class Student
{
public static void main(String[] args)
{
int std_id;
String std_name,std_attend;
System.out.println("Enter the student name :");
Scanner sc=new Scanner(system.in);
std_name=sc.next();

System.out.println("Enter student id:");
std_id=sc.nextint();

System.out.println("Enter student Attendence 'p' or 'a' :");
std_attend=sc.next();

System.out.println("Student name:"+std_name "+std_id  "+std_attend);

}
}