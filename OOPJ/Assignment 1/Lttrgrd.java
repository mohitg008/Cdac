import java.util.*;
class Lttrgrd {
 public static void main(String args[])
 {  
    Scanner sc = new Scanner(System.in);
    int Grade = sc.nextInt();
    if(Grade>=85)
      System.out.println("Your Grade is A ");
      else if(Grade>=75 && Grade<85)
      System.out.println("Your Grade is B ");
      else if(Grade>=60 && Grade<75)
      System.out.println("Your Grade is C");
      else if(Grade>=40 && Grade<60)
      System.out.println("Your Grade is D");
      else 
    System.out.println("Your Grade is F");


 }
    
}
