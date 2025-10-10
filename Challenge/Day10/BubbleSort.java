import java.util.*;
                 // Bubble Sort
public class BubbleSort {
          // Take Max element and push to last position using adjacent swap

          public static void main(String[] args) {
                    int arr[] = {1,4,8,4,0,3,2};

                    for(int i=arr.length-1;i>=0;i--){
                              for(int j=0;j<arr.length-1;j++){
                                        if(arr[j]>arr[j+1]){
                                              int temp = arr[j];
                                                  arr[j] = arr[j+1];
                                                  arr[j+1] = temp;
                                        }
                              }
                    }

                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }


          }
          
}
