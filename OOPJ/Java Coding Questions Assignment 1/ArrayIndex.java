//3.	Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;

class ArrayIndex{
  

  public static void main(String arg[])
  {   
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of ArrayList");
        int size = sc.nextInt();
      ArrayList<Integer> list = new ArrayList<>(size);


      System.out.println("Enter only "+size+" of integer elements");
      for(int i=0; i<size;i++)
        { 
           list.add(sc.nextInt());
         }

    System.out.println("Enter the element index want to print range 0-"+(size-1));
      int element=sc.nextInt();
  
      if(element < size)
         { 
            System.out.println("element at index "+element +" is "+ list.get(element));
          }
       else
         System.out.println("Wrong input range");

       

  }
}