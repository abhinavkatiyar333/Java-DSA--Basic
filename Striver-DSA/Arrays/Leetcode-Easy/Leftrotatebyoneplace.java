import java.util.*;

public class Leftrotatebyoneplace {
          public static void main(String[] args) {
                    int arr[] = { 1,2,3,4,5};
                    int n = arr.length-1;
                     int temp = arr[0];
                    for(int i=0; i<n;i++){
                              arr[i] = arr[i+1];
                    }

                    arr[n] = temp;
                   

                    for(int i=0; i<=n; i++){
                              System.out.print(arr[i]+ " ");
                    }
          }
}
