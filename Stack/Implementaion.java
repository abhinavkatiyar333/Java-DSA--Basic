import java.util.*;

public class Implementaion {

        static class Stack {
          static ArrayList<Integer>list = new ArrayList<>();

          public static boolean isEmpty(){
                    return list.size()== 0;
          }
          // push operations
          public static void push(int data){
                    list.add(data);

          }
          //pop operations
          public static int pop(){
                    int top = list.get( list.size()-1);
                    list.remove(list.size()-1);
                    return top;
          }
          // peek operations
          public static int peek(){
                    return list.get(list.size()-1);
          }
        }

          
          public static void main(String[] args) {
                    Stack ll = new Stack();
                    ll.push(1);
                     ll.push(2);
                      ll.push(3);
                     System.out.println( ll.peek());
                      System.out.println(ll.pop());
                     System.out.println( ll.peek());

                    
          }
          
}
