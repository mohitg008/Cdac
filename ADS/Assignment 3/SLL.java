//Q1.Implement singly linked list in java

class SLL{

 static Node head;
static class Node{
 
    int data;
    Node next;
    
   Node(int d){
               this.data=d;
             }
}

 static void display(){
   Node curr = head;
  while(curr != null)
     {
         System.out.print(curr.data+"-->");
           curr = curr.next;
        }
         System.out.print("Null");
   

   }

public static void main(String args[])
 {
    SLL  list = new SLL();
   head = new Node(1);
    Node second = new Node(2);
    Node third  = new Node(3);
    head.next    = second;
   second.next  = third;
    display();
   }


}