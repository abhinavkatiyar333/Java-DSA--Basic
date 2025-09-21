import java.util.*;
public class Anagram {
          public static void main(String[] args) {
                    String first = "abhinav";
                    String second = "navabhi";
            boolean    isarmstrong = false;



                    if(first.length() != second.length()){
                       isarmstrong = false;

                    }else{
                              char [] obj1 =  first.toCharArray();
                              char [] obj2 =  second.toCharArray();

                              Arrays.sort(obj1);
                              Arrays.sort(obj2);

                              isarmstrong = Arrays.equals(obj1, obj2);
                             
                    }
                     System.out.println(isarmstrong);
                    
          }
}
