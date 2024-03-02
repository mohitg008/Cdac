import java.util.*;
class Q5{

public static void main(String arg[]){



Scanner sc=new Scanner(System.in);
System.out.println("Enter an array size: ");
int size=sc.nextInt();
int arr[]=new int[size];

int max=arr[0];
int scndmax=arr[0];
System.out.println("Enter an array: ");
for(int i=0;i<size;i++){
                       arr[i]=sc.nextInt();   
                       }
for(int i=0; i<size;i++)
                    {

if(arr[i]>max){

   max=arr[i];
     
}                   }


for(int i=0;i<size;i++){
                       if(arr[i]>scndmax && arr[i] != max){
                                 scndmax=arr[i] ;            
                                      }
                                         }
 
 System.out.println("Second largest number is :"+scndmax);
  System.out.println("most largest number is :"+max);







}


}