import java.util.*;

public class Divisers {
          public static void main(String[] args) {
                    int n = 18;
                    int count =0;

                    for(int i=1; i<=n; i++){
                              if(n%i == 0){
                                        count++;
                                        System.out.print(i+ " ");
                              }
                              
                    }
                    System.out.println();

                    System.out.print(" Number of divisors is "+count);
          }
          
}
