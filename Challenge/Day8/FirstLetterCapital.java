import java.util.*;
public class FirstLetterCapital {

          // Capitalize the first letter of each word.


          public static void main(String[] args) {
                    String name = "my name is abhinav";
                    String result = "";

                    String[] words = name.split(" ");

                   for(int i=0;i<words.length;i++){
                    result+= words[i].substring(0,1).toUpperCase()+words[i].substring(1) + " ";
                   }
                    System.out.println(result.trim());
          }
          
}
