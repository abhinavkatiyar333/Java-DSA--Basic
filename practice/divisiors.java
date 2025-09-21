import java.util.*;

public class armstrong {
          public static void main(String[] args) {
                    int original = 154;
                    int number = original;

                    int count = String.valueOf(number).length();
                    int sum =0;
               

                    while(number>0){
                              int digit = number%10;
                              sum += Math.pow(digit , count);
                              number = number/10;
                    }

                    if(sum != original){
                              System.out.println("Not a palindrome number");
                    }
                    else{
                              System.out.println("it is a palindrome number");
                    }

          }
          
}
