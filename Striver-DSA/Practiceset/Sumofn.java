import java.util.*;
public class Sumofn {

          int Print(int n){
                    if(n==0){
                              return n;
                    }else{
                        return n + Print(n-1);
                             

                    }

          }
          public static void main(String[] args) {
                    int n = 10;
                    int sum = 0;
                    Sumofn s1 = new Sumofn();
                    s1.Print(n);
                    System.out.println(s1.Print(n));

          }
          
}
