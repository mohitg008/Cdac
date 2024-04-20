// 1.	Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.*;

class Colors{

  public static void main(String[] args)
  { 
     ArrayList<String> color = new ArrayList<>();

     color.add("Black");
     color.add("White");
     color.add("Red");
     color.add("Green");
     color.add("Blue");

   
     //System.out.println(color);
         
     for(int i=0; i<color.size(); i++)
        {
                 System.out.println(color.get(i));
         }  
 
 
  }


}