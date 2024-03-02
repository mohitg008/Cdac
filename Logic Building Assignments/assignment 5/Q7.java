import java.util.*;
class Q7{




public static void main(String arg[])
{
Q7 obj = new Q7();
Scanner sc= new Scanner(System.in);
System.out.println("Enter size of an Array:");
int size=sc.nextInt();
int arr1[]=new int[size];
int arr2[]=new int [size];
System.out.println("Enter Array 1");
arr1=obj.scanArr(arr1);
System.out.println("Enter Array 2");
arr2=obj.scanArr(arr2);


obj.common(arr1,arr2);




}



int[] scanArr(int []arr1){
Scanner sc= new Scanner(System.in);

 for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
                    }
     return arr1;
}



void common(int []arr1,int []arr2){
                                System.out.print("Common elements: ");

int cmmn[]=new int [arr1.length];

      for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr1.length;j++){
                if(arr1[i]==arr2[j]){
                 cmmn[i]=arr1[i];
               System.out.print(cmmn[i]+" ");
                  
                                   }

          }
}
}}

