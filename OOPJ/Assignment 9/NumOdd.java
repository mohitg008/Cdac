//2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

import java.util.Scanner;

class NumOdd1 extends Exception{
    
      public String toString(){

     return "Number is Odd";

 }


}



public class NumOdd{


public static void main(String args[]){

  Scanner sc =new Scanner(System.in);
  int a;

  System.out.println("Enter varible a value: ");
  a=sc.nextInt();
 try{
 if(a%2 != 0)
   throw new NumOdd1();
  
  
else
 System.out.println("Number is not odd"); }
  catch(NumOdd1  e){
  System.out.println(e);

}


}
}


