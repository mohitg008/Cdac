import java.util.*;
class Q4{

public static void main(String arg[]){
 
Scanner sc=new Scanner(System.in);
System.out.println("Enter an array size: ");
int size=sc.nextInt();
int arr[]=new int[size];
 int sum=0;

System.out.println("Enter an array: ");
for(int i=0;i<size;i++){
                       arr[i]=sc.nextInt();   
                       }
for(int i=0; i<arr.length;i++){
             sum=sum+arr[i];
                             }
      System.out.println("Sum of all elements :"+sum);                               }
         }