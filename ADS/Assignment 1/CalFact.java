// Author :- Mohit Gaikwad
// Date :- 02-04-2024


import java.util.Scanner;

class CalFact{           

         static int fact(int a){     
  
          if(a != 0){
             
            return  a*fact(a-1);

           }
       else{
               return 1;
  
         }

      }
 

public static void main(String args[]){
 
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number who's Factorial is to be calculated: ");
 int a=sc.nextInt(); 
  
  

System.out.println( fact(a));


}
}