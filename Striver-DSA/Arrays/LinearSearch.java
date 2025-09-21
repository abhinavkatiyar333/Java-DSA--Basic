import java.util.*;

public class LinearSearch {
          public static void main(String[] args) {
                    int arr[] = { 1, 2, 3, 4, 5, 32, 0 };
                    int n = arr.length;
                    int target = 4;

                    for (int i = 0; i < n; i++) {
                              if (arr[i] == target) {
                                        System.out.print("First occurence of "+ target+" is = "+i);
                                        break;
                              }
                    }
          }

}
