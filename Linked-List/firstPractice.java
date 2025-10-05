public class firstPractice {

          public class Node{
                    int data;
                    Node next;

                    // contructer 
                     public Node(int data){
                              this.data = data;
                              this.next = null;
                     }
          }

          public static Node head;
          public static Node tail;
          public static int size;

          public void addFirst(int data){
                    Node newNode = new Node(data);
                    size++;
                    if(head == null){
                              head = tail = newNode;
                              return;
                    }
                    newNode.next =  head;
                    head = newNode;
          }

          public void addLast(int data){
                    Node newNode = new Node(data);
                    size++;
                    if(head == null){
                              head = tail = newNode;
                              return;
                              
                    }
                    tail.next = newNode;
                    tail = newNode;
          }
          public void addMid(int data , int index){
                    if(index == 0){
                              addFirst(data);
                    }
                    if(index == size){
                              addLast(data);
                    }
                    Node newnode = new Node(data);
                    size++;
                    Node temp = head;
                    for(int i=0;i<index-1;i++){
                              temp = temp.next;
                    }
                    newnode.next = temp.next;
                    temp.next = newnode;
                    
          }

          public int removeFirst(){
                    if (size == 0) {
                   System.out.println("Linked list is empty");
                   return Integer.MIN_VALUE;
        }
                    int val = head.data;
                    size--;
                    head = head.next;
                    if(head == null){
                              tail = null;
                    }

                   // System.out.println("After remove First");
                    return val;
          }

          public int removeLast(){

                    if(size == 0){
                              System.out.println("LL is empty");
                              return Integer.MIN_VALUE;
                    }
                    else if(size ==1){
                              int val = head.data;
                              head = tail = null;
                              size--;
                              return val;
                    }
                    
                    Node temp = head;
                   
                    for(int i=0;i<size-2;i++){
                              temp = temp.next;
                    }
                    int val = tail.data;
                     size--;
                    temp.next = null;
                    tail = temp;
                    return val;
          }
          public void print(){
                    Node temp = head;
                   if(temp == null){
                    System.out.println("Linked-list is empty");
                    return;
                   }
                   while(temp!= null){
                   
                              System.out.println(temp.data);
                              temp = temp.next;
                    
                   }
                   System.out.println();
          }
          public int Iterative( int key){
                int index = 0;
                Node temp = head;
                while(temp != null){
                    index++;
                    if(temp.data == key){
                     return index;

                    }
                    temp = temp.next;
                    

                }
                return -1;

          }
          public void Reverse(){
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while(curr !=null){
              next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;

            }
            head = prev;
          }
          public static void main(String[] args) {
                    firstPractice ll = new firstPractice();
                    ll.addFirst(3);
                   // ll.print();
                    ll.addFirst(2);
                  //  ll.print();
                    //ll.addFirst(1);
                   // ll.print();
                   ll.addLast(4);
                   // ll.print();
                    ll.addLast(6);
                    //ll.print();
                    //System.out.println("Size of ll is = "+ll.size);
                   // System.out.println( " remove first element = "+ll.removeFirst());
                   // ll.print();
                   // System.out.println("Size of ll is = "+ll.size);
                   // System.out.println("Remove last element = "+ll.removeLast());
                    ll.print();
                    ll.addMid(5,2);
                    ll.print();
                  System.out.println( ll.Iterative(4));
                  System.out.println("Reverse a linked list");
                  ll.Reverse();
                  ll.print();
                  
                    
          }
          
}
