// Author :- Mohit Gaikwad
// Date :- 02-04-2024

import java.util.Scanner;
public class Fibonacci{
  
   static int calFib(int n){
		if (n<=1){
			return n;
                         }
		else  {
			return calFib(n-1)+calFib(n-2);
                    }
                     }

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Your number :");
int num=sc.nextInt();

  for(int i=1; i<=num;i++){

       System.out.print(calFib(i) + " ");


      }

    }
}


//for 5 ---> 1 1 2 3 5
//for 10 --->1 1 2 3 5 8 13 21 34 55
//for 30 --->1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040
//for 50 --->1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 102334155 165580141 267914296 433494437 701408733 1134903170 1836311903 -1323752223 512559680 -811192543 -298632863
//for 100 --->