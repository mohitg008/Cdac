//linked list practice


public class LinkList{
    
  static Node head;
   
   static class Node{
            int data;
            Node link;
             
         Node(){
                
              this.data=data;
              this.link=null;
                }    
          
                   }


      static void display(){
          
            Node ref = head;
          while(ref != null){
                System.out.println(ref.data+"---->");
                     ref = ref.link; 
              }
 

              }
   
  public static void main(String args[]){
        
         LinkedList l1 = new LinkedList();
         li.head = new Node(5);
          Node two = new Node(6);
          Node Three = new Node(7);
          
          li.link = two.data;
          li.two.link = three.data;  
          
        l1.display();


}

}