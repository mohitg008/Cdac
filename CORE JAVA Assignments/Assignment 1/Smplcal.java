import java.util.*;

class Smplcal{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter First Number :");
    double num1=s.nextDouble();
    System.out.println("Enter Second Number :");
    double num2=s.nextDouble();
    System.out.println("Enter Operator + , - , * , /" );
    char Oper=s.next().charAt(0);
    double result=0.0d;
    switch(Oper){
        
        case '+' : result = num1+num2;
                      break;
        case '-' : result = num1-num2;
                      break;
        case '*' : result = num1*num2;
                      break;
        case '/' : result = num1/num2;
                      break;
        default   : System.out.println("Enter Valid Operator"); 


        }
    

   }

  

}