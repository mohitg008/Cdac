//2. Sum of natural numbers using recursion

import java.util.Scanner;
 class SumNum{

   static int sum(int n){
      
         if(n==0){

       return 0;
 
             }
         else{

             return n + sum(n-1);
         }

    }


public static void main(String args[]){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number : ");
   int a = sc.nextInt();
  
         
 int res =  sum(a);

System.out.println("your result is : "+res);

}

}