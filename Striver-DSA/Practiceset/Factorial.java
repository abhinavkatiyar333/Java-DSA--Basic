import java.util.*;
public class Factorial {

            int  Print(int n){
                    if(n==0 || n==1){
                              return 1;
                    }else{
                         return n*Print(n-1);  
                    }
            }
          public static void main(String[] args) {
                    int n = 10;
                    Factorial f1 = new Factorial();
                    f1.Print(n);
                    System.out.println(f1.Print(n));
          }
          
}
