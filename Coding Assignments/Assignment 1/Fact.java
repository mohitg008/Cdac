// Write a Java Program to find the Factorial of given number. 

import java.util.Scanner;
class Fact{

public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number to calculate factorial");
   int num = Integer.parseInt(sc.nextLine());
    int fact =1;
   if( num > 0 ){
        for(int i=1; i<=num ; i++)
     { 
       
     fact = fact*i;
           
     }
    }
    
     
   else 
System.out.println("Enter value non-negative and greater than zero");
    
   System.out.println("Factorial of "+ num +" is "+ fact);
}
}