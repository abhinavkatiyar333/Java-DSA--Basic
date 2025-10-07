import java.util.*;
public class kadansalgo {

          //   Kadane’s Algorithm is a Dynamic Programming technique used to find the maximum sum of a contiguous subarray within a one-dimensional array of numbers.
          public static void main(String[] args) {
                    int num[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
                    int currSum = 0;
                    int maxSum = Integer.MIN_VALUE;

                    for(int i=0;i<num.length;i++){
                              currSum+= num[i];
                              if(currSum > maxSum){
                                        maxSum = currSum;
                              }
                              if(currSum<0){
                                        currSum = 0;
                              }
                    }
                    System.out.println("Maximum Subarray Sum: " + maxSum);
          }
          
}
