class Vehicle{
       int price;
       String color;
       String model;
      
       Vehicle(int x, String y, String z)
{
        price=x;
        color=y;
        model=z;       
}
void display()
{
      System.out.println("Price of Vechical is "+ price);
      System.out.println("color of Vechical is "+ color);
      System.out.println("model of Vechical is "+ model);
}

   public static void main(String arg[])
    {
      
      Vehicle car = new Vehicle(2000,"blue","XS7");
      car.display();
      
       
  }




}
















