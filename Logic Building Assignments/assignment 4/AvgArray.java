//assignment 4 Q1

class AvgArray{

public static void main(String arg[])
{
 int arr []= {5,4,3,9,1,7,9};
 double avg=0.0;
 float sum=0.0f;
int count=0;
for (int i=0; i<7;i++){
   sum= sum + arr[i]; 
   count++;
}
avg= sum/count;
System.out.println("Average sum of all elements is "+avg);
System.out.println("Sum of all elements is "+sum);
System.out.println(" "+count);



}


}