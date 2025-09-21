import java.util.*;

public class LeftRotateBestApproach {

          public static void Reverse(int arr[] , int start, int end){
                    while(start<end){
                              int temp = arr[start];
                              arr[start] = arr[end];
                              arr[end] = temp;
                              start++;
                              end--;
                    }
          }
          public static void main(String[] args) {
                    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
                    int n = arr.length;
                    int d = 3;

                    d = d%n;
                      // reverse first d element
                    Reverse(arr, 0, d-1);

                    // reverse remaining element
                    Reverse(arr, d, n-1);

                    // Reverse whole arr[]
                    Reverse(arr, 0, n-1);

                    for(int i=0; i<=n-1;i++){
                              System.out.print(arr[i]+" ");
                    }


          }
}