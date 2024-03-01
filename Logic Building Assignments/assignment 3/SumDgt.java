//assignment 3 Q15


class SumDgt{
public static void main(String arg[])
{
int in=123; //assumed input
int sum=0;
 do{
 
  sum += in%10;
  in = in/10;
  

}while(in>0);
System.out.print(sum);


}

}



