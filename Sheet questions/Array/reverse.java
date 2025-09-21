import java.util.*;
public class reverse {


          public static void print(int arr[]){
                    int n = arr.length;
                    for(int i=n-1; i>=0 ; i--){
                              System.out.print(arr[i]);
                    }
          }

          public static void print1(int arr[]){
                    int n = arr.length;
                    int temp[] = new int[n];

                    for(int i=0; i<n; i++){
                              temp[i] = arr[n-i-1];
                    }

                    for(int i=0; i<n ; i++){
                              arr[i] = temp[i];
                    }
                    // print
                    for(int i=0; i<arr.length; i++){
                              System.out.print(arr[i]+" ");
                    }
          }
          public static void main(String[] args) {
                    int arr[] = {3,5,7,2,4,5};
                   // print(arr);
                    print1(arr);
          }
          
}
