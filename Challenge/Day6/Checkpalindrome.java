import java.util.*;

public class Checkpalindrome {
                  //  check Palindrome in a String
          public static void main(String[] args) {
                    boolean isPalindrome = true;
                    String name = "abccba";
                    
                    String rev = "";

                    for(int i= name.length()-1;i>=0;i-- ){
                              rev+= name.charAt(i);
                    }
                    if(rev.equals(name) ){
                              isPalindrome = true;
                    }else{
                              isPalindrome = false;
                    }

                    System.out.println(isPalindrome);

          }
          
}
