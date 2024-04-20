import java.util.Scanner;
import java.util.Arrays;

class SwapArray{

public static void swap(int arr[],int i1, int i2)
 {
     int temp = arr[i1];
      arr[i1]=arr[i2];
      arr[i2]=temp;
 

 }

// to reverse 
 
public static void rev(int arr[])
 {
    int start = 0;
    int end = arr.length-1;
   while(start<end)
    { 
      swap(arr,start,end);
       start++;
       end--;
    }
 }

public static void main(String[] args)
{
  int[] arr = {5,6,1,2,3,4};
 
  swap(arr,0,3);
  System.out.println(Arrays.toString(arr));
    rev(arr);
  System.out.println(Arrays.toString(arr));

}

}