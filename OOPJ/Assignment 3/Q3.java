
// Author :- Mohit Gaikwad
// Date :- 14th March 2024

// 3) Write a program that performs arithmetic operations involving different data types (int, double, float)  and observes how Java handles widening conversions automatically. 

public class Q3 {
    public static void main(String args[])
    {
        int a=10;
        float b=20.0f;
        double c=30.00d;
        double sum= a+b+c;
        System.out.println(sum);

        // o/p --> 60.0 --> in double 

    }
}
