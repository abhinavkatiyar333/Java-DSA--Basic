import java.util.Scanner;

public class reverse {
          public static void print(int arr[]){
                    int start = 0;
                    int end = arr.length-1;

                    while(start < end){
                              int temp = arr[start];
                              arr[start] = arr[end];
                              arr[end] = temp;
                              start++;
                              end--;
                    }        
          }

          public static void output(int arr[]){
                    for(int i=0; i<arr.length; i++){
                              System.out.print(arr[i]+ " ");
                    }
          }
          public static void main(String[] args) {
                    int arr[] = { 3, 5,7,2,8,4};
                   print(arr);
                   output(arr);
          }
          
}
