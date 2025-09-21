import java.util.*;
public class printRecursion {


           // base condition
            void print(int n){
                    if(n<1){
                         return;     
                    }else{
                              System.out.println(n + " ");
                              print(n-1);
                    }
            }

          public static void main(String[] args) {
                   int n = 10;
                   printRecursion p1 = new printRecursion();
                   p1.print(n);
          }
          
}
