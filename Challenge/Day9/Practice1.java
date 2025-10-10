import java.util.*;

public class Practice1 {
            // . Check palindrome
          public static void main(String[] args) {
                    boolean isPalindrome = true;
                    String name = "abhhba";
                    String Check = "";

                    for (int i = name.length() - 1; i >=0; i--) {
                              Check += name.charAt(i);
                    }
                    if(Check.equals(name)){
                              isPalindrome = true;
                    }else{
                              isPalindrome = false;
                    }

                    System.out.println(isPalindrome);
          }

}
