import java.util.*;

public class ReverseString {
                   // Reverse a String
          public static void main(String[] args) {

                    // way 1

                  String name = "Abhinav";
          //           String rev = "";

          //           for(int i=name.length()-1;i>=0;i--){
          //                     rev += name.charAt(i);
                             
          //           }
          //           System.out.println(rev);

                  // way 2 (Using string builder)

                  StringBuilder sb = new StringBuilder(name);
                  System.out.println("Reverse of a string := "+ sb.reverse());


                  
                    
          }
          
}
