// assignment 4 Q2

class MinMax{
public static void main(String arg[])
{
int arr[]={5,4,3,9,1,7,9};
int min=arr[0],max=arr[0];

for(int i=0; i<7;i++)
                    {

if(arr[i]>max){
   max=arr[i];
}
    if(arr[i]<min){
      min=arr[i];
}
    

                            }
 
 System.out.println("Max:"+max);
 System.out.println("Min:"+min);
       


  }
}