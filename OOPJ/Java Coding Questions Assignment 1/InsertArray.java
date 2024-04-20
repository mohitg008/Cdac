//2.	Write a Java program to insert an element into the array list at the first position.

import java.util.*;

class InsertArray{


public static void main(String[] args)
{

   ArrayList<Integer> list = new ArrayList<>();

   list.add(1);
   list.add(2);
   list.add(3);
   list.add(4);
   list.add(5);


      System.out.println(list);
    
  list.add(0,5);
 
      System.out.println(list);
    

}
 


}