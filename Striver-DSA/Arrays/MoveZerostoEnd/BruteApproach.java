import java.util.*;

public class BruteApproach {
          public static void main(String[] args) {
                    int arr[] = { 1, 0, 2, 3, 4, 0, 4, 0, 5 };
                    int n = arr.length;
                    int newArr[] = new int[arr.length];

                    // Create new array and store all non Zeros to this array
                    int j = 0;

                    for (int i = 0; i < n; i++) {
                              if (arr[i] != 0) {
                                        newArr[j] = arr[i];
                                        j++;
                              }

                    }

                    for (int i = 0; i < newArr.length; i++) {
                              System.out.print(newArr[i] + " ");
                    }
          }

}
