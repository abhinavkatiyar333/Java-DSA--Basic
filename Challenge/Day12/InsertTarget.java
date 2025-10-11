import java.util.*;
                       //   Find the Index to Insert Target (Lower Bound)
public class InsertTarget {

          public static int Findindex(int arr[], int target){
                    for(int i=0;i<arr.length;i++){
                              if(arr[i]>=target){
                                      return i;
                                        

                              }
                    }
                    return arr.length;

          }
          public static void main(String[] args) {
                    int arr[] = {1,3,5,6};
                    int target = 2;

             int answer =   Findindex(arr, target);
             System.out.println(answer);

                    
                  


                    
          }
          
}
