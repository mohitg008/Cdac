//4. Sum of array elements using recursion

import java.util.Scanner;
class SumOfElm
{

   static int sum(int arr[],int size)
    {
        int sum = 0;
         if(size<=0)
          {
            return sum; 
           }
         else
            {
                   sum = arr[size-1]+sum(arr,size-1);
                   
            }

           return sum;
    }


public static void main(String args[])
{

 Scanner sc =new Scanner(System.in);
 System.out.println("Enter the size of an array: ");
 int size = sc.nextInt();
 int arr[] = new int[size];
 int i=0;
 System.out.println("Enter the array elements: ");

 for( int element : arr )
   {   
      arr[i++] = sc.nextInt();

        }
 System.out.println("Total Sum of array elements is : "+sum(arr,size));



}


}