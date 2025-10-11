import java.util.*;
public class firstAndLastoccurance {
              
                       // Practice First and Last Occurance in Array
          public static int firstocc(int arr[],int target){
                     int start = 0;
                    int end = arr.length-1;
                    int result1 = -1;

                    while(start<=end){
                              int mid = start+(end-start);

                              if(arr[mid] == target){
                                        result1 = mid;
                                        end = mid-1;

                              }else if(arr[mid]<target){
                                        start = mid+1;
                              }else{
                                        end= mid-1;
                              }
                                        
                              }
                              return result1;
                             


                    }

                    public static int Lastocc(int arr[], int target){
                               int start = 0;
                               int end = arr.length-1;
                               int result2 = -1;

                    while(start<=end){
                              int mid = start+(end-start);

                              if(arr[mid] == target){
                                        result2 = mid;
                                        start = mid+1;

                              }else if(arr[mid]>target){
                                         end= mid-1;
                                        
                              }else{
                                       start = mid+1;
                              }
                                        
                              }
                              return result2;
                             

                    }
          
          public static void main(String[] args) {
                    int []arr = {1,2,3,4,4,4,4,5,6};
                    int target = 4;

                  int first = firstocc(arr, target);
                  int last = Lastocc(arr, target);

                  int count = ((last-first)+1);

                  System.out.println("First occurance is : ="+first);
                  System.out.println("Last occurance is : ="+last);
                  System.out.println("Total count in Array : ="+ count);
                    

                    
          }
          
}
