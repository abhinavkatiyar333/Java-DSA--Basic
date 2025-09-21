import java.util.*;

public class InsertionSort {
          public static void main(String[] args) {
                    int arr[] = { 4, 3, 7, 9, 6, 3, 8 };

                    for (int i = 0; i < arr.length; i++) {
                              int j = i;
                              while (j > 0 && arr[j - 1] > arr[j]) {
                                        int temp = arr[j];
                                        arr[j] = arr[j - 1];
                                        arr[j - 1] = temp;

                                        j--;
                              }
                              System.out.println();
                    }
                    for (int i = 0; i < arr.length; i++) {
                              System.out.print(arr[i] + " ");
                    }

          }

}
