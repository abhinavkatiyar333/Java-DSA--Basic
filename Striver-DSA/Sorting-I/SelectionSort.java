import java.util.*;

public class SelectionSort {
          public static void main(String[] args) {
                    int arr[] = {13,46,24,52,20,9};

                    for(int i=0; i<arr.length-1;i++){
                              for(int j= i; j<arr.length;j++){
                                        if(arr[i]>arr[j]){
                                                  int temp =  arr[i];
                                                  arr[i] = arr[j];
                                                  arr[j] = temp;
                                        }
                              }
                              System.out.println();
                    }

                    // print array
                    for(int i=0; i<arr.length; i++){
                              System.out.print(arr[i]+ " ");
                    }
          }
}
