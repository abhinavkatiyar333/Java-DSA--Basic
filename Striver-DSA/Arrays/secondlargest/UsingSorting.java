import java.util.*;

public class UsingSorting {
          public static void main(String[] args) {
                    


                    int arr[] = { 7,4,6,2,9,10,7,10};
                    int n = arr.length;
                           // brutal approach  
                           Arrays.sort(arr);

                           int largest =  arr[n-1];
                           for(int i = n-2; i>=0;i--){
                              if(arr[i] != largest){
                                        System.out.println(arr[i]);
                                        break;
                              }
                           }


          }

}
