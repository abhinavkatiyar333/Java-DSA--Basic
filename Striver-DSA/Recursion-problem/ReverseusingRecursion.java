import java.util.*;

public class ReverseusingRecursion {

          void reverse(int arr[], int st, int end) {
                    if (st >= end) {
                              return;
                    } else {

                              int temp = arr[st];
                              arr[st] = arr[end];
                              arr[end] = temp;
                              // recursive call
                              reverse(arr, st + 1, end - 1);
                    }

          }

          public static void main(String[] args) {
                    int arr[] = { 1, 2, 3, 4, 5 };
                    ReverseusingRecursion R1 = new ReverseusingRecursion();
                    R1.reverse(arr, 0, arr.length - 1);

                    for (int i = 0; i < arr.length; i++) {
                              System.out.print(arr[i] +" ");
                    }
          }

}
