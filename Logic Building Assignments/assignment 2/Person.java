class Person{
     int age=0;
     float height=0.0f;
     float weight=0.0f;
   
 Person(int a){
       age=a;
      
}

Person(int x, float y){
        age=x;
       height=y;
       
}
Person( int q, float r,float  u){
        age=q;
       height=r;
       weight=u;
}
 public static void main(String arg[])
 {
   Person p1 = new Person(30); 
   Person p2 = new Person(20,6.2f);
   Person p3 = new Person(65,6.0f,60.0f);
   p1.display();
   p2.display();
   p3.display();
}

void display()
{
 System.out.println("age of this this person is " +age);
 System.out.println("height of this person is " +height);
 System.out.println("weight of this this person is " +weight);

}}