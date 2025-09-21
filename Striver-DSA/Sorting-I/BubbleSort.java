import java.util.*;

public class BubbleSort {
          public static void main(String[] args) {
                    int arr[] = {2, 5,7,3,13,15,1};

                    for(int i=arr.length-1; i>=0;i--){
                              for(int j=0; j<=i-1;j++){
                                        if(arr[j]> arr[j+1]){
                                                  int temp = arr[j];
                                                  arr[j] = arr[j+1];
                                                  arr[j+1] = temp;
                                        }
                              }
                              System.out.println();
                    }
                    for(int i=0; i<arr.length; i++){
                              System.out.print(arr[i]+" ");
                    }
          }
          
}
