// 1. Print 1 to n without using loops



import java.util.Scanner;
class PrintNum{


  
   static void printN(int n){
          
        if( n<=0 ){
             
              return;          
            }
  
           printN(n-1);
           System.out.print(n + " ");


          }


public static void main(String args[]){
 
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number n :");
  int a = sc.nextInt();

     System.out.println("Numbers from 1 to " + a + ":");

   printN(a);



}



}