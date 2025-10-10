import java.util.*;

public class findLastOccurance {
           // find last occurance of Target value
          public static void main(String[] args) {
                     int arr[] = {2,4,4,4,6,7,8};
                   int  target = 4;
                    int result = -1;

                    int start =0;
                    int end = arr.length-1;

                    while(start <= end){
                              int mid =  start+(end-start)/2;
                              
                              if(arr[mid] == target){
                                       result = mid;
                                        start = mid+1;
                              }
                                                                                                                  
                              else  if(arr[mid]>target){
                                end = mid-1;
                               }else{
                              start = mid+1;
                               }
                              

                              }
                              System.out.println("First occurance is : = "+ result);


          }
          
}
