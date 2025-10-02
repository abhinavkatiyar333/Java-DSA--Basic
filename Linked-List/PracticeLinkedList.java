import java.util.*;
public class PracticeLinkedList {
          public static void main(String[] args) {
                    LinkedList<String>List = new LinkedList<>();
                    List.addFirst("c");
                    List.addFirst("b");
                    List.addFirst("a");
                    System.out.println("After add first = "+ List);

                    List.addLast("d");
                    List.addLast("e");
                    List.addLast("f");
                    System.out.println("After add last = "+ List);

                    List.remove("a");
                    List.remove("b");
                    List.remove("c");
                     System.out.println("After remove = "+ List);

          }
          
}
