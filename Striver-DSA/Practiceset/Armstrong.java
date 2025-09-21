import java.util.*;

public class Armstrong {
          public static void main(String[] args) {
                    int Original =  153;
                    int n = Original;

                    n = Math.abs(n);
                    int arms = 0;

                    int count = String.valueOf(n).length();

                    if(n==0){
                              System.out.println(n);
                    }else{
                              while(n>0){
                                        int digit = n%10;
                                        arms +=  Math.pow(digit , count);
                                        n = n/10;

                              }
                              
                    }
                    if(Original == arms){
                              System.out.println("It ia a palindrome number");
                    }else{
                              System.out.println("Not a palindrome number");
                    }
          }
          
}
