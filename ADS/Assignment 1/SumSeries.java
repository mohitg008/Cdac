// Author :- Mohit Gaikwad
// Date :- 02-04-2024

import java.util.Scanner;

public class SumSeries{
   
    static int sum(int a, int b){
  
           if(a<=b){
             
            return a+sum(a+1,b);
           
         }

     else 
        return 0;
                                      //for(int i=0; i<=5;i++)
        }


public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
   int a=0;
 System.out.println("Enter the Values who's sum is to be calculated");
   int b=sc.nextInt();
  int result = sum(a,b);
 System.out.println("Total Sum of " + b + " is " + result);

}
}