import java.util.*;

public class OptimalApproach {
          public static void main(String[] args) {
                    int arr[] = { 1, 2, 4, 7, 7, 5, 9, 9, 8, 7, 8 };
                    int n = arr.length;
                    int seclargest = Integer.MIN_VALUE;

                    int largest = Integer.MIN_VALUE;

                    for (int i = 0; i < n; i++) {
                              if (arr[i] > largest) {
                                       seclargest = largest;
                                       largest = arr[i];
                              }else if(arr[i]>seclargest && arr[i]<largest){
                                        seclargest = arr[i];
                              }
                    }
                    System.out.println("Largest value is " + largest);
                    System.out.println("Second largest is " + seclargest);
          }

}
