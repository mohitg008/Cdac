import java.util.*;

class Max{
  
  static void findMax(int a[])
   {
     int max=a[0];
     for(int i=0; i<a.length; i++)
     {
        if(a[i]>max)
           {
               max=a[i];
           }
   
     }
 System.out.println(max);

   }

//in a particular range
static void findMaxEle(int a[],int start,int end)
   {
     int max=a[0];
     for(int i=start; i<end; i++)
     {
        if(a[i]>max)
           {
               max=a[i];
           }
   
     }
 System.out.println(max);

   }
 public static void main(String[] args)
  {
      int a[]={1,5,6,4,8,3,4,3};

    findMax(a);
   findMaxEle(a,1,3);

  }

}