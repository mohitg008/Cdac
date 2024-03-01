class Box{
         int h;
         int w;
         int b;
         
    Box(){ 
           h= 2;
           w= 4;
           b= 6;        
         getVolume();
           getArea();
          
         }       
    Box(int x, int y , int z )
         {
           h=x;
           w=y;
           b=z;
           getVolume();
           getArea();
             }
public static void main(String args[])
 {
    Box obj = new Box();
    Box obj2 = new Box(4,4,4);
    Box obj3  = new Box(8,8,8);
   

 
     }
 void getVolume()
         {
          int Volume=h*w*b;
            System.out.println("Total Volume is "+Volume);
          }
  void getArea()
         {
         int Area=2*w*b+2*b*h+2*h*w;
         System.out.println("Total surface Area is "+ Area);
         }
}