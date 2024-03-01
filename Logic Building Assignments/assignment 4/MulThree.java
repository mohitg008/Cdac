// assignment 4 Q3
import java.util.*;
class MulThree{

  public static void main(String arg[])
   {
            Scanner sc=new Scanner(System.in);
        
      System.out.println("Please Enter A Number:");
        
        int n=sc.nextInt();
        int sum=0;
        int t=0;
        int count=0;
        for(int i=0;i<n;i++){
                t=2*(i-1);
                if(t%3==0){                
                    count++;
                   sum=sum+i;

                           }
                              }
               System.out.println("Sum :"+sum);
               System.out.println("Total number multiple of 3: "+count);






    } 







}