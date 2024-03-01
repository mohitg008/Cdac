//assignment 4 Q4
 
import java.util.*;
class AddMat{

public static void main(String arg[])
{  
  
 Scanner sc=new Scanner(System.in);

   System.out.println("Enter size of matrix ");
    System.out.println("Enter size of row:" );
    int r=sc.nextInt();
    System.out.println("Enter size of coloumn");
    int c=sc.nextInt();
   int m1[][] = new int [r][c];
   int result[][]=new int[r][c];
   int m2[][] =new int [r][c];

System.out.println("Enter Matrix 1 values:"); 
 for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                         m1[i][j]=sc.nextInt();    
                             }
                  }
System.out.println("Enter Matrix 2 values:"); 
for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                         m2[i][j]=sc.nextInt();    
                             }
                  }


   for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                         result[i][j]=m1[i][j]+m2[i][j];    
                             }
                    }
System.out.println("Result Matrix is:");
 for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                             System.out.print(result[i][j]+" ");
                             }
                    System.out.println("");
                  }
}        
}


