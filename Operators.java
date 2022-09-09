     
     //write a java code to cover all types operators//

 class Operators
{
 public static void main(String[] args)
{
  int a ,b, c ;    //assingment operator//
  a=5;
  b=a;
  c=a+b-3;

  a=a+11;   //multiassingment operator//

  a=2;
  b=4;      //Arithmetic operators//
  c=a+b;

 a=2;  //unary operatos//
 b=++a;
 c=a++ + ++b;

   //ternary operators//

 a=6;        
 b=4;
 c=(a<b) ? a : b ;    


  //bitwise operator//
 a=2;
 b=4;
 System.out.println(a&b);


  //Relational operators//
  
  a=1;
  b=2;
  boolean b1, b2, b3, b4;
  b1=(a>b);
  b2=(a<b);
  b3=(a==b);
  b4=(a!=b);

     //logical operators//

  a=2;
  b=3;
  boolean flag;
  flag=(a>3) && (b<2);

 System.out.println("flag value "+flag);
 System.out.println(b1+" +b2+" +b3+"  "+b4);
 System.out.println("c value is "+ c);
 System.out.println(a+ +b+  +c);
 System.out.println(a+" +b + "+c);
 System.out.println("a value is  "+a);
 System.out.println(c=a+b);
}
}
