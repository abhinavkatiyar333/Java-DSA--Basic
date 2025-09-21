import java.util.*;

public class Reverse {


          public static void main(String[] args) {
                    int arr[] = {1,2,3,4,5};
                    int start = 0;
                    int end = arr.length-1;

                    for(int i=0; i<arr.length; i++){
                              if(end>start){
                                        int temp = arr[start];
                                        arr[start] = arr[end];
                                        arr[end]  = temp;
                                        start ++;
                                        end--;
                              }
                              System.out.print(arr[i]+ " ");
                    }



          }
          
}
