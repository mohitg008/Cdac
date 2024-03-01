//assignment 3 Q18
import java.util.*;
class Calculator{


public static void main(String arg[])
{
System.out.println("Simple Calculator");
System.out.println("-----------------");

Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");

int op1=sc.nextInt();
System.out.println("Enter second number:");

int op2=sc.nextInt();
int R=0;


   System.out.println("Choose an operation");
   System.out.println("1. Addition");
   System.out.println("2. Subtraction");
   System.out.println("3. Multiplication");
   System.out.println("4. Division");


   
   System.out.println("Enter your Choice");
   int Operation=sc.nextInt();
 switch(Operation)
{

case 1:  R= op1 + op2 ;
         System.out.println("Result : "+op1+" + "+op2+" = "+R );
                  break;
case 2:  R= op1 - op2 ;
         System.out.println("Result : "+op1+" - "+op2+" = "+R );
                  break;
case 3:  R= op1 * op2 ;
         System.out.println("Result : "+op1+" * "+op2+" = "+R );
                  break;
case 4:  R= op1 / op2 ;
         System.out.println("Result : "+op1+" / "+op2+" = "+R );
                  break;


}




}

}