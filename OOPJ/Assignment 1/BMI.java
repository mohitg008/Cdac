import java.util.*;
class BMI {
    public static void main (String [] arg){
          Scanner s=new Scanner(System.in);
          System.out.println("Enter your Height in Meters : ");
          double height=s.nextDouble();
          System.out.println("Enter your Weight in in Kilograms : ");
          double Weight=s.nextDouble();
           double BMI = Weight/(height*height);

         if(BMI<=18.5)
         System.out.println("Underweight");

        else if(BMI>=18.5 && BMI<25)
        System.out.println("Normal Weight");

        else if(BMI >= 25 && BMI < 30 )
        System.out.println("Overweight");

        else if(BMI>=30 )
        System.out.println("Obesity");

        else 
        System.out.println("You have entered wrong values");
}
}