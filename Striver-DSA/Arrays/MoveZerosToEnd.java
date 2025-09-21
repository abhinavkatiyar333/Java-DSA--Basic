import java.util.*;
public class MoveZerosToEnd {
           public static void moveZeros(int[] arr) {
        int n = arr.length;
        int index = 0; 

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        
        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        System.out.println(" after moving zeros: " + Arrays.toString(arr));
    }
}
