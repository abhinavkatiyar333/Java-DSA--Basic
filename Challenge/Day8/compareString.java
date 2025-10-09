import java.util.*;
public class compareString {
          // Compare two strings without .equals().


          public static void main(String[] args) {
                     String str1 = "Java";
                      String str2 = "Java";

        
        boolean isEqual = true;

        // Step 1: Check if lengths are equal
        if (str1.length() != str2.length()) {
            isEqual = false;
        } else {
            // Step 2: Compare each character
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        // Step 3: Print result
        if (isEqual) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
                    
          }
          
}
