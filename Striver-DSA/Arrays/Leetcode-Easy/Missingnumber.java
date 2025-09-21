import java.util.*;

public class Missingnumber {
          public static void main(String[] args) {
                    int arr[] = {0, 1,2,3,5,6};
                    int n = arr.length;

                    int sum = (n*(n+1))/2;
                    int sum2 = 0;

                    for(int i=0;i<n;i++){
                              sum2+= arr[i];
                    }

                    System.out.println(sum - sum2);
          }
          
}
