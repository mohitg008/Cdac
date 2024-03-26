//3. Write a Java program throws an array index out of bound exception.
 

class IndexOutBoundEx{

public static void main(String args[]){

 int a[]={20,30,50,41,0};

try{
System.out.println(a[5]);
}
catch(IndexOutOfBoundsException e){

System.out.println(e);
}


}




}