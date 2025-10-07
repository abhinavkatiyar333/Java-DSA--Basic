import java.util.*;

public class countwords {
                  // Count words in a string.
          public static void main(String[] args) {
                     String sentence = "Java is fun to learn";
        
          //         sentence.trim() removes any leading and trailing whitespace from the string (e.g., " foo " → "foo").

          //        .split("\\s+") splits the trimmed string into parts using the regular expression \s+ (one or more       whitespace characters).

          //        In Java string literals you write \\s+ so the runtime sees \s+.

          //        This handles spaces, tabs, newlines, and multiple consecutive spaces (e.g., "a b" → ["a","b"]).
                  String[] words = sentence.trim().split("\\s+");
        
        System.out.println("Total words: " + words.length);
          }
          
}
