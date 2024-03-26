
//4. Write a code for arithmetic exception using one try block & multiple catch block & check which catch block handle that exception.

class MultiCatch{

public static void main(String args[]){


int a[]={5,3,1,4,0};
int c;
try{
c= a[0]/a[4];
System.out.println(a[5]);
}

catch(ArithmeticException e){
System.out.println(e);
}
catch(IndexOutOfBoundsException ee){
System.out.println(ee);

}

}



}