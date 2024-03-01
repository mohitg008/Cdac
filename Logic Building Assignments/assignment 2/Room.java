class Room{
            int h;
            int w;
            int b;
 

            public static void main(String args[])
             {
               Room Room = new Room();
               
               int V;
              V = Room.volume(4,4,4);
               System.out.println("Volume of Room "+V);
             }

             int volume(int h,int w, int b)
            {
               int vol= h*w*b;
                return vol;
            }
}