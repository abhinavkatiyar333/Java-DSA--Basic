import java.util.*;

public class countFrequency {
           // count Frequency of each number in an ARRAY
          public static void main(String[] args) {
                    int num[] = {2,3,4,5,2,3,4,5};
                     boolean visited[] = new boolean[num.length];  // track counted elements

                    for(int i=0;i<num.length;i++){

                               if (visited[i]) continue;  // skip if already counted
                                int count = 1; // start count with 1 for current element


                              for(int j=i+1;j<num.length;j++){
                                        if(num[i]== num[j]){
                                                  count++;
                                         visited[j] = true;   // mark as counted
                                                  

                                        }
                              }
                              System.out.println("Frequency of " + num[i] + " is := " + count);
                    }


                    
          }
          
}
