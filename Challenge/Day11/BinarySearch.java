import java.util.*;

public class BinarySearch {
          //   Basic Binary Search (Iterative + Recursive)
          public static void main(String[] args) {
                    int  arr[] = {1, 3, 5, 7, 9, 11};
                    int  target = 7;

                    int start =0;
                    int end = arr.length-1;

                    while(start <= end){
                              int mid =  start+(end-start)/2;
                              
                              if(arr[mid] == target){
                                        System.out.print("Index at : = "+mid);
                              }
                                                                                                                  
                              if(arr[mid]>target){
                                end = mid-1;
                               }else{
                              start = mid+1;
                               }
                              

                              }
                             

                    }


          
}

