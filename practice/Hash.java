
import java.util.*;
public class Hash {
          public static void main(String[] args) {
                    int arr[] = {1,1,2,3,4,5,1,5,3,4,1,4,4,4};
                    int target = 1;

                    int hash []= new int[6];

                    for(int i=0; i<arr.length;i++){
                              hash[arr[i]] += 1;
                    }
                    System.out.println(hash[target]);
          }
          
}
