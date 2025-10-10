import java.util.*;

public class removeDublicates {

          // remove dublicate in string in string
          public static void main(String[] args) {
                    String name1 = "Abhinav";
                    StringBuilder newStr = new StringBuilder();
                    name1 = name1.toLowerCase();

                    for(int i=0;i<name1.length();i++){
                              char ch = name1.charAt(i);

                            
                     if (newStr.indexOf(String.valueOf(ch)) == -1) {
                      newStr.append(ch);
                       }
                    }

                    
                     System.out.println(newStr.toString());

                    
            
          }
          
}
