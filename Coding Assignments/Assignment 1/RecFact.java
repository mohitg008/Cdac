// Find the Factorialof a number using Recursion. 

import java.util.Scanner;
class RecFact{

static int Factorial(int num)
{
  if(num == 0)
   {
    return 1;
    }   
   else
   {
    
   return num * Factorial(num-1);
   }

}


public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number to calculate factorial");
   int num = Integer.parseInt(sc.nextLine());
  int fact = Factorial(num);
System.out.println("Factorial of "+num +" is "+fact);

}
}


