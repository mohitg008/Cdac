//Check the given number is EVEN or ODD.

import java.util.Scanner;
class EvenODD{

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in); // scanner object
  System.out.println(" Enter A number to check weather it is ODD or Even");
  int Num = Integer.parseInt(sc.nextLine()); // scanned integer value thorugh parsing it 
  if(Num%2 == 0) // if block checking if remainder of number is 0 if divided by 2. if 0 then number is even if not 0 then number is odd.
   System.out.println("Number "+Num +" Is Even"); 
  else
   System.out.println("Number "+Num +" Is Odd");
}

}