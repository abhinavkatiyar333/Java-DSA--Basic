import java.util.*;
public class RightRotatebyDplace {

          public static void Reverse( int arr[], int start , int end){
                    while(start<end){
                              int temp = arr[start];
                              arr[start] = arr[end];
                              arr[end] = temp;
                              start++;
                              end--;
                    }
          }
          public static void main(String[] args) {
                    int arr[] = {1,2,3,4,5,6,7};
                    int d = 3;
                    int n = arr.length;

                    d = d%n;

                    // reverse whole array
                    Reverse(arr, 0, n-1);
                    // reverse first d element
                    Reverse(arr, 0, d-1);
                    // reverse Remaining element
                    Reverse(arr, d, n-1);

                    for(int i=0; i<n;i++){
                              System.out.print(arr[i]+ " ");
                    }


                    
          }
          
}
