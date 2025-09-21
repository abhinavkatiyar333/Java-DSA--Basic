import java.util.*;

public class palindrome {
          public static void main(String[] args) {
                    int Original = 1234432;
                    int  n = Original;
                    n = Math.abs(n);
                    int rev =0;

                    if(n==0){
                              System.out.println(n);
                    }else{
                           while(n>0){
                              int digit = n%10;
                               n = n/10;

                              rev = rev*10+ digit;
                           }
          
                    }
                      System.out.println(rev);

                      if(Original == rev){
                              System.out.println("It is  a palindrome number");
                      }else{
                              System.out.println("Not a palindrome number");
                      }
          }
          
}
