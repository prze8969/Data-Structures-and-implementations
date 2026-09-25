class Node{
  int data;
  Node next;
  Node(int d){
    this.data = d;
    next = null;
  }
}


public class SinglyLinkedList{
  Node head;
  SinglyLinkedList(){
    head = null;
  }

  void insert_at_begining(int val){
    Node newnode = new Node(val);
    if(head == null){
      head = newnode;
      newnode.next = null;
      return;
    }

    newnode.next = head;
    head = newnode;
  }

  void insert_at_end(int val){
    Node newnode = new Node(val);
    if(head == null){
      head = newnode;
      newnode.next = null;
      return;
    }

    Node curr = head;
    while(curr.next!=null){
      curr = curr.next;
    }
    curr.next = newnode;
    newnode.next = null;
    
  }

 void insert_before_node(Node gnode, int data){
   Node newnode = new Node(data);
   if(heaad == null){
     System.out.println("List is empty");
   }

   Node curr = head;
   while(curr.next!=gnode && curr.next!=null){
     curr = curr.next;
   }
   if(curr.next == null){
     System.out.println("The given node is not found in the linkedlist");
     return;
   }

   newnode.next = curr.next;
   curr.next = newnode;
   

 }
 void insert_after_node(Node gnode , int data){
   
   Node newnode = new Node(data);
   if(heaad == null){
     System.out.println("List is empty");
     return;
   }

   Node curr = head;
   while(curr != gnode && curr!=null){
     curr = curr.next;
   }
   if(curr == null){
     
     System.out.println("The given node is not found in the linkedlist");
     return;
   }

   newnode.next = curr.nextt;
   curr.next = newnode;

 }

 void delete_begining_node(){
   
   if(heaad == null){
     System.out.println("List is empty");
     return;
   }

   if(head.next==null){
     head = null;
     return;
   }
   Node temp = head;
   head = head.next;
   
   
 }
 void delete_end_node(){
   
   if(heaad == null){
     System.out.println("List is empty");
     return;
   }

   if(head.next==null){
     head = null;
     return;
   }

   Node curr = head;
   while(curr.next.next!= null){
     curr = curr.next;
   }
   curr.next = null;
 }

 void delete_given_node(Node gnode){
   
   if(heaad == null){
     System.out.println("List is empty");
     return;
   }

   if(head == gnode){
     head = null;
     return;
   }
   Node curr = head;
   while(curr.next!=gnode && curr.next!=null){
     curr = curr.next;
   }
   
   curr.next = curr.next.next;
   

   
 }
  
  
  public static void main(String[] args){
    System.out.println("Hellow world");
  }
}
