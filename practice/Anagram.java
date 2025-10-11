import java.util.*;
public class Anagram {
          public static void main(String[] args) {

                    // Check anagram
                    String name1 = "abhinav";
                    String name2 = "navabht";
                    boolean isAnagram = true;

                    name1 = name1.replaceAll("\\s" , " ").toLowerCase();
                    name2 = name2.replaceAll("\\s" , " ").toLowerCase();

                    if(name1.length() != name2.length()){
                              isAnagram = false;
                    }else{

                              char str1[] = name1.toCharArray();
                              char  str2[] = name2.toCharArray();

                              Arrays.sort(str1);
                              Arrays.sort(str2);

                              System.out.println(Arrays.equals(str1, str2));
                        

                              
                    }

                    
          }
          
}
