//1.Implement singly linked list in java

class LinkedList{
             
    static Node head;
    
 
    static class Node
      {         
          int value;
          Node next;  
        
        Node(int value){
                this.value=value;
                 this.next=null;
              }
      
       }
           static void display(){
                       Node current = head;
                        while(current != null){
                             System.out.print(current.value+"--->");
                              current=current.next;
                          }
                             System.out.print("null");

                     }

public static void main(String args[])
 {
      LinkedList list = new LinkedList();  
       list.head = new Node(1);
       Node two = new Node(2);
       Node three = new Node(3);
     list.head.next=two;
     two.next=three;
 
       list.display();
   
 }
 

}