import java.util.Scanner;

import java.util.*;

class Leapyr {
    public static void main(String args[])
    {
          Scanner s=new Scanner(System.in);
          int flag = 0;
          int  Year = s.nextInt();
          if(Year % 4 ==0 && Year % 100 != 0 || Year % 400 ==0){
            flag =1;
          }


          switch (flag){

        case 1: System.out.println(Year+" Is a Leap Year");
                      break;
        case 0: System.out.println(Year+ " Is not a Leap Year");
                    break;
          }
        



    }
    
}
