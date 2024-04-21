// 6. Write a Java program of swap two elements in an array list.

import java.util.*;
 
class  ArrayListSwap
{

   static void swap(ArrayList<Integer> a, int i1,int i2)
    {
      int temp = a.get(i1);
      a.set(i1,a.get(i2));
      a.set(i2,temp);

    }
  
 public static void main(String[] args)
  {
       Scanner sc = new Scanner(System.in);
     ArrayList<Integer> a = new ArrayList<>();
    
     a.add(5);
     a.add(6);
     a.add(7);
     a.add(8);
     a.add(4);
  
     System.out.println("Original Array "+ a);
 
     System.out.println("Enter the index to swap ");
     int i1 = sc.nextInt();
     System.out.println("to swap with ");
     int i2 = sc.nextInt();
     swap(a,i1,i2);

     System.out.println("Swapped Array "+ a);




  } 
}