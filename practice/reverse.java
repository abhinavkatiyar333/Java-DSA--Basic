import java.util.*;

public class reverse {
          public static void main(String[] args) {
                    int arr[] = {1 ,2 ,3 ,4 ,5 ,6};
                    int number[] = new int[arr.length];

                    for(int i=0; i<arr.length; i++){
                              number[i] = arr[arr.length-1-i];
                    }

                    for(int i=0; i<number.length; i++){
                              System.out.print(number[i]);
                    }
          }
          
}
