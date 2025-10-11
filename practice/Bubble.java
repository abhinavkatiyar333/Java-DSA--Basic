import java.util.*;
public class Bubble {
          public static void main(String[] args) {
                    int arr[] = {1,5,8,2,7,0};

                    // bubble sort max element shift to last using adjacent swap
                    for(int i = arr.length-1;i>=0;i--){
                              for(int j=i;j<arr.length-1;j++){
                                        if(arr[j]>arr[j+1]){
                                                  int temp = arr[j];
                                                  arr[j]   = arr[j+1];
                                                  arr[j+1] = temp;
                                        }
                              }

                    }
                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }
          }
          
}
