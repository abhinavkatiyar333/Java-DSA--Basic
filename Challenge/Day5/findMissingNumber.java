import java.util.*;

public class findMissingNumber {
            // Find Missing number in Array
          public static void main(String[] args) {
                    int num[] = {1,2,3,5};
                    int  n =5;
                    int sumArray =0;
                    
                  // sum of n number n*(n+1)/2
                    int sumofn = (n*(n+1))/2;

                    // sum of all element of an Array
                    for(int i=0;i<num.length;i++){
                              sumArray+= num[i];

                    }
                    // Find missing number
                    System.out.println("Missing number is := "+ (sumofn-sumArray));
                    
          }
          
}
