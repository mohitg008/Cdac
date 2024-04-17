// 3. Mean of Array using Recursion

import java.util.Scanner;

 class MeanArray
{

 static int avgArray(int arr[],int size)
   {
         int sum=0;
           if(size<=0)
             {   
                   return sum;
             }   
          else
             {
               sum = arr[size-1]+avgArray(arr,size-1);
             }    
          return sum;

       }
   


 public static void main(String arg[])
 {

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the size of an Array: ");
 int size = sc.nextInt();
 int arr[] = new int[size];
 System.out.println("Enter the array elements");
 for(int i=0; i<arr.length;i++)
   {
      arr[i]=sc.nextInt();
  } 
   
 int avg = avgArray(arr,arr.length)/size;
 System.out.println( "Average of this array is "+avg);


}
}