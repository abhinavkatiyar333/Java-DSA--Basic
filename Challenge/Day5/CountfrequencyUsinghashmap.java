import java.util.*;

public class CountfrequencyUsinghashmap {
          public static void main(String[] args) {
                    int num[] = { 1,2,3,4,4,3,2,1};

                    HashMap<Integer, Integer> freq = new HashMap<>();

                    for(int i=0;i<num.length;i++){
                              if(freq.containsKey(num[i])){
                                        freq.put(num[i], freq.get(num[i])+1);
                              }else{
                                        freq.put(num[i], 1);
                              }
                    }

                     List<Integer> keys = new ArrayList<>(freq.keySet());

                    // Print frequency using simple for loop
                    for (int i = 0; i < keys.size(); i++) {
                    int key = keys.get(i);
                     int value = freq.get(key);
                   System.out.println("Frequency of " + key + " is: " + value);
                   }
                 }
          
}
