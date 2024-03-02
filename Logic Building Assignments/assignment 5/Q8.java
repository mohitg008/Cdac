import java.util.*;
class Q8{
 public static void main(String arg[])
{


Scanner sc= new Scanner(System.in);
System.out.println("Enter Size An Array:");
int s=sc.nextInt();
System.out.println("Enter An Array:");
int arr1[]=new int[s];
int newarr[]=new int[s];
 for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
                    }
 for(int i=0;i<s;i++ ){
                                              int j=0;                                  
                                            if(i==0 || arr1[i]!=arr1[i-1]){
                                                       newarr[i]=arr1[i];
                                                          
                                                           System.out.print(newarr[i]+" ");
                                                                     }                                                   
                                              j++;                                  
                         }
                                                
 
                          
}
}