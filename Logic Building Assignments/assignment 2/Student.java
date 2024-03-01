class Student{
        String Name;
        int sub1;
        int sub2;
        int sub3;
    
       public static void main(String args[])
       {
         Student obj = new Student();
         obj.assign("mohit",1,2,3);
         obj.avg();
         obj.display();
         
         }
        void assign(String s, int a ,int b, int c)
        {
          Name=s;
          sub1=a;
          sub2=b;
          sub3=c;
          }
       void avg()
         {
          int avg=(sub1+sub2+sub3)/3;
         System.out.println("total Average "+avg);
         }
        void display()
          {
           int total=sub1+sub2+sub3;
           System.out.println("Name of student "+Name);
           System.out.println("total Marks "+total);
          } 
         }