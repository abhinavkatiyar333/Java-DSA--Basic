package Challenge.Day2;
import java.util.*;

public class sumandaverage {
                    // Average and Sum  of an ARRAY
          public void Average(int num[]){
                    int sum =0;
                    for(int i=0;i<num.length;i++){
                              sum+= num[i];

                    }
                     System.out.println("Sum of Array is := "+ sum );
                    System.out.println("Average of Array is := "+ sum/num.length );
          }
            // Find odd or even number in an ARRAY
          public void oddorEven(int num[]){
                    int countodd = 0;
                    int counteven =0;
                    for(int i=0;i<num.length;i++){
                              if(num[i]%2 ==0){
                                        counteven ++;
                              }else{
                                        countodd++;
          
                              }
                    }
                    System.out.println("Total odd number is := "+ countodd);
                    System.out.println("Total Even number is := "+ counteven);

          }

          public static void main(String[] args) {
                    int num[] = { 3,5,2,7,5,6};
                    sumandaverage ss = new sumandaverage();
                    ss.Average(num);
                    ss.oddorEven(num);
                    
          }
          
}
