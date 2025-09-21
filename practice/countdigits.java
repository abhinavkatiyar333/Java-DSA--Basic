import java.util.*;

public class countdigits {
          public static void main(String[] args) {
                    int n = -123456;
                    int count =0;

                    n = Math.abs(n);
                    if(n==0){
                              count=1;
                    }
                    else{
                              while(n>0){
                                       // n = n%10;
                                       n =   n/10;
                                        count++;
                                        
                              }
                    }
                    System.out.println(count);
          }

}
