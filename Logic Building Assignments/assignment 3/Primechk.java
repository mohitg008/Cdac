//assignment 3 Q 16

//Factors 1 and itself and greater than 1

class Primechk{

public static void main(String arg[]){

 int in = 0; //assumed input


for(int i=2; i<in;i++){
if(in%i==0){
 System.out.println("Number is not prime");
 break;
}

else if(in%in==0 && in%1==0){
System.out.println("Number is Prime");
break;
}

}
if(in<=1){

 System.out.println("Enter value greater than 1");
}

}

}
