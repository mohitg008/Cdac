// Assignment 4 Q5
 
import java.util.*;
 class MatEqual{

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
int count=0;
 for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                           if(m1[i][j]==m2[i][j]){
                              
                                     count++;

                                }
                             }
                    
   if(count>0){
        System.out.println("Matrices are equal");

              }
     else if(count==0)
                 {
   System.out.println("Matrices are not equal");
                 }

}

}
}