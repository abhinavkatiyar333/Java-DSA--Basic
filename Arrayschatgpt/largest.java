import java.util.*;

public class largest {
          public static void main(String[] args) {
                    int arr[] = { 4, 2 ,6 ,47 ,9};
                    int max = Integer.MIN_VALUE;

                    for(int i=0; i<arr.length; i++){
                              if(arr[i] > max){
                                        max = arr[i];
                              }
                    }
                    System.out.println(max);
          }
          
}
