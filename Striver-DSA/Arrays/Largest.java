import java.util.*;

public class Largest {

          public static void main(String[] args) {
                    int arr[] = {2 ,9,4,7,3,6};
                    int n = arr.length-1;
                    // 1. Brutale solution
               // sort array an print last index
               //  Arrays.sort(arr);
              // System.out.println(arr[n]);

              // 2 better solution
              int large = arr[0];
              for(int i=0; i<=n; i++){
                    if(arr[i]>large){
                              int temp = arr[i];
                              arr[i] =  large;
                              large = temp;
                    }

              }
              System.out.println(large);
          }
          
}
