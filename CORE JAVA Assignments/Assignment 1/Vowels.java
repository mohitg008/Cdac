import java.util.*;

class Vowels {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      char V = sc.next().charAt(0);
     if('a'== V || 'i' == V ||'e' == V || 'o' == V || 'u'== V || 'A'== V || 'I'== V || 'E'== V || 'O'== V || 'U'== V)
     {
        System.out.println("This is Vowel");
       }
     else
     System.out.println("This is Consonant");

    } 
    
}
