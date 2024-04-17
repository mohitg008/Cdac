//3.How to reverse a linked list in java
public class DLL2 {
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
        Node  last = null;
        while(curr != null)
        {
            System.out.print(curr.data+"-->");
            last = curr;
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println();

        System.out.println("printing in reverse ");

        while(last != null)
        {
            System.out.print(last.data+"-->");
             last=last.prev;
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
