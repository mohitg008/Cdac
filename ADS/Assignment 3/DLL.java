//2. Implement Doubly linked list in java
public class DLL {
  static Node head;
    static class Node{
            
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
          this.data=data;
        }
        
    }

    static void insertFirst(int data)
    {
        Node node = new Node(data);
        node.next=head;
        node.prev=null;
        if(head != null)
        {
            head.prev=node;
        }
        head=node;
    }
    static void display()
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.print("null");

    }
    public static void main(String args[])
    {
     insertFirst(10);
     insertFirst(20);
     insertFirst(30);
     display();

    }
}
