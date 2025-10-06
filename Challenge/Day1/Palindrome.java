import java.util.*;

public class Palindrome {
                  
       //   check number is Palindrome or not
          public static void main(String[] args) {
                    int number = 12321;
                    boolean ispalindrome = false;
                    int rev =0;
                    int original = number;
                     
                    while(number !=0){
                              int num = number%10;
                               rev = rev*10+num;
                               number = number/10;

                    }

                    if(rev == original){
                              ispalindrome = true;
                              
                    }else{
                              ispalindrome= false;
                    }

                    System.out.println(ispalindrome);

                    
          }
          
}
