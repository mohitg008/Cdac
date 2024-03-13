
import java.util.*;
class Weekdays{
public static void main(String args[])
{
  Scanner s= new Scanner(System.in);
  System.out.println("Enter Number between 1-7 :");
  int D=s.nextInt();
switch(D){

case 1 : System.out.println("Monday");
         break;
case 2 : System.out.println("Tuesday");
         break;
case 3 : System.out.println("Wednesday");
         break;
case 4 : System.out.println("Thursday");
         break;
case 5 : System.out.println("Friday");
         break;
case 6 : System.out.println("Saturday");
         break;
case 7 : System.out.println("Sunday");
         break;
default : System.out.println("You Have Entered wrong value or Day");
         break;

}
}
}