 //1. Write a Java program that throws an arithmetic exception and catch it using a try-catch block.


class AtrithmeticEx{

public static void main(String arg[]){


  int a=10;
   int b=0;
  int c=0;

 try{
  c= a/b;
  }
 catch(ArithmeticException p){

   System.out.println(" You cannot divide by zero");
}





finally{

System.out.println("-----finally-----");
}


}




}