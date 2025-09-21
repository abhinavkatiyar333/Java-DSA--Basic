public class second {

          public static class Node {
                    int data;
                    Node next;

                    public Node(int data){
                    this.data = data;
                    this.next = null;
                    }
          }

          public static Node head;
          public static Node tail;
          // create method

          public void addFirst(int data){

                    // step 1 = create new node
                    Node newNode = new Node(data);
                    // if my linked list is impty
                    if(head == null){
                              head = tail = newNode;
                              return;

                    }

                    // new Node next point old head
                    newNode.next = head;
                    // value of head = new Node
                    head = newNode;
          }

          public void addLast(int data){
                    // create new Node
                    Node newNode1 = new Node(data);
                    if(head == null){
                              head = tail = newNode1;
                              return;
                    }
                    tail.next = newNode1;
                    tail = newNode1;
          }

          public void print(){
                    if(head == null){
                              System.out.println("Linked-list is null");
                              return;
                    }
                    Node temp = head;
                    while(temp != null){
                              System.out.println(temp.data);
                              temp = temp.next;
                    }
                    System.out.println();
          }

          public static void main(String[] args) {
           second ll = new second();
           ll.print();
           ll.addFirst(2);
           ll.print();
           ll.addFirst(1);
           ll.print();
           ll.addLast(3);
           ll.print();
           ll.addLast(4);
           ll.print();
                    
          }
}
