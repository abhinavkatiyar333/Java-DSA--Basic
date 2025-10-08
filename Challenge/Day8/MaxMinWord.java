 import java.util.*;
public class MaxMinWord {
         

               // Find largest and smallest word in a sentence.
            public static void main(String[] args) {
                    String name = "My name is Abhinav katiyar";
                    name = name.toLowerCase();
                   
                    
                    String []words = name.split(" ");  // .split(" ")

                      // The split() method breaks a string into parts (called tokens)
                      // words[0] = "My"
                      // words[2] = "is"
                      // words[1] = "name"
                      // words[4] = "katiyar"
                      // words[3] = "Abhinav"

                    String SmallWord = words[0];
                    String MaxWord = words[0];
                    

                    for(int i=0;i<words.length;i++){
                              if(words[i].length() <  SmallWord.length()){
                              SmallWord = words[i];
                              }
                               if (words[i].length() > MaxWord.length()) {
                                    MaxWord = words[i];
                         }

                    }
                    System.out.println("Smallest word := "+ SmallWord);
                    System.out.println("Largest word := "+ MaxWord);

          }
          
}

          

