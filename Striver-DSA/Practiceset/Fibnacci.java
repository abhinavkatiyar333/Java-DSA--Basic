import java.util.*;
public class Fibnacci {

          int print(int n){
                if(n==0 || n==1)  {
                    return n;
                }  

                int f1 = print(n-1);
                int f2 = print(n-2);
                int sum = f1+f2;
                return sum;
          }
          public static void main(String[] args) {
                    int n = 10;

                    Fibnacci f1 = new Fibnacci();
                    
                    //f1.print(n);
                    System.out.println(f1.print(n));
          }
          
}
