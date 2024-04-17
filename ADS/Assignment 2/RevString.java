//7.Print reverse of a string using recursion

import java.util.Scanner;
class RevString
{

    static String rev(char[] a, int i )
     {        char b[] = new char[a.length];
             if(i<0)
               { 
                return "";
                }
            else
                {
                b[a.length-1-i] = a[i];
               return b[a.length-1-i]+rev(a, i-1);

                 }
      }
     

public static void main(String args[])
{
  Scanner sc =new Scanner(System.in);
  String str = sc.nextLine();
   char a[] = str.toCharArray();
  String Reversed = rev(a,a.length);
System.out.println(str+"is reversed to "+Reversed);
}

}