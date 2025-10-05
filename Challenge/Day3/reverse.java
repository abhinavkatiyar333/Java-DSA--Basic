package Challenge.Day3;
import java.util.*;

public class reverse {
          public static void main(String[] args) {
                    int num[] = { 1,2,3,4,5};

                    int start =0;
                    int end = num.length-1;

                    while(end >= start){
                              int temp = num[start];
                              num[start] = num[end];
                              num[end] = temp;
                             
                              start++;
                              end--;
                    }
                    for(int i=0;i<num.length;i++){
                              System.out.print(num[i]+ " ");
                    }


                    
          }
          
}
