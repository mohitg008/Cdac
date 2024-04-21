//5.	 Write a Java program to reverse elements in a array list.

import java.util.*;
class ArrayRev{
 
  static void swap(ArrayList<Integer> arr, int i1, int i2)
   {
            int temp = arr.get(i1);
            arr.set(i1, arr.get(i2));
            arr.set(i2,temp);

   }

static void reverse(ArrayList<Integer> arr)
  {
     int start = 0;
     int end = arr.size()-1;
      while(start<end)
      {  
        swap(arr,start,end);
        start++;
        end--;

      }
  }


public static void main(String[] args)
{
  ArrayList<Integer> arr = new ArrayList<>();

  arr.add(1);
  arr.add(2);
  arr.add(3);
  arr.add(4);
  arr.add(5);

  System.out.println("Array List "+ arr);
  reverse(arr);
  System.out.println("Reverse Array List "+ arr);
  
 

}
}