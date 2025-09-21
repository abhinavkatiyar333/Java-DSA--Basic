public class three {

          class Node{
                    int data;
                    Node next;

                    // constructor
                    public Node(int data ){
                              this.data = data;
                              this.next = null;

                    }
          }

                    public  Node head;
                     public  Node tail;
                    // 
                    
                    // add new Node
                    public void addFirst(int data){
                              Node newnode = new Node(data);
                              if(head == null ){
                                 head = tail = newnode;
                                 return;
                              }
                              newnode.next =  head;
                              head = newnode;


                    }
                    public  void Addlast(int data){
                              Node newNode = new Node(data);

                              if(head == null){
                                        head = tail = newNode;
                                        return;
                              }
                              tail.next = newNode;
                              tail = newNode;
                    }
                    public void print(){
                              Node temp = head;
                              if(head == null){
                                        System.out.println("linked-list is impty");
                                        return;
                              }
                              while(temp != null){
                                        System.out.print(temp.data+ "->");
                                        temp = temp.next;
                              }
                              System.out.println();

                    }
          
          public static void main(String[] args) {
                    three ll = new three();
                    ll.addFirst(4);
                    ll.print();
                    ll.print();
                    ll.addFirst(2);
                    ll.print();
                    ll.addFirst(1);
                    ll.print();
                    ll.Addlast(3);
                    ll.print();
                    ll.Addlast(6);
                    ll.print();
                    
          }
          
}
