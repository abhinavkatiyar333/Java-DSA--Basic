import java.util.*;

public class countDgit {
          public static void main(String[] args) {
                    int n = 120345600;
                    int count =0;

                  n =  Math.abs(n);
                    if(n==0){
                        count = count+1;
                    }

                    while(n>0){
                              int digit = n%10;

                              count = count+1;
                              n = n/10;

                    }
                    System.out.println(count);
          }
          
}
