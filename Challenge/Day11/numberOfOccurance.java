import java.util.*;
                // Find number of Occurance in Array {Important question}

public class numberOfOccurance {

           // First occurance
          public static int firstOccur(int arr[], int target){
                  int start =0;
                  int end = arr.length-1;
                  int  firstocc =-1;

                    while(start <= end){
                              int mid =  start+(end-start)/2;
                              
                              if(arr[mid] == target){
                                        firstocc = mid;
                                        end = mid-1;  // check left and replace for First occurance
                                        
                              }
                                                                                                                  
                             else if(arr[mid]>target){
                                end = mid-1;
                               }else{
                              start = mid+1;
                               }
                              

                              }
                              return firstocc;

                    }
                       // last occurance

           public static int lastOccur(int arr[], int target){
                  int start =0;
                  int end = arr.length-1;
                  int  lastocc =-1;

                    while(start <= end){
                              int mid =  start+(end-start)/2;
                              
                              if(arr[mid] == target){
                                        lastocc = mid;
                                        start = mid+1;  // check right and replace value for last occurance
                                        
                              }
                                                                                                                  
                             else if(arr[mid]>target){
                                end = mid-1;
                               }else{
                              start = mid+1;
                               }
                              

                              }
                              return lastocc;
                             
                 

          }
          public static void main(String[] args) {
                 int    arr[] = {2,4,4,4,4,7,8};
                 int target = 4;

                 int first = firstOccur(arr, target);
                 int last = lastOccur(arr, target);
              

               if (first == -1) {
               System.out.println("Target not found in array");
               } else {
              int count = (last - first) + 1;
              System.out.println("First Occurrence: " + first);
              System.out.println("Last Occurrence: " + last);
              System.out.println("Number of Occurrences: " + count);
        }
    }
                 
                    
          }
          

