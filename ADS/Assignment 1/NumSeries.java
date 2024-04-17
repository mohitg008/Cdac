// Author :- Mohit Gaikwad
// Date :- 02-04-2024

import java.util.Scanner;

public class NumSeries{
   
   
  public static void seriesNum(int a,int b){

     
     
    if(a<=b){
               System.out.print(a+" ");
               a++;
            seriesNum(a,b);

             }
 
   }
  
 public static void main(String args[]){
   
  Scanner sc = new Scanner(System.in);
  System.out.println("---Enter the range of numbers to print------");
  System.out.println("Print From :");
  int a = sc.nextInt(); 
  System.out.println("to :");
  int b = sc.nextInt();
  System.out.println("For Range ("+a+" to "+b+")");   
  seriesNum(a,b);

}
}