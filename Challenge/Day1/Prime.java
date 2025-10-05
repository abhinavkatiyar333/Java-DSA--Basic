import java.util.*;

public class Prime {
          public static void main(String[] args) {
                    int number = 2;
                    boolean isprime = true;
                    if(number<=1){
                              isprime = false;
                              System.out.println(isprime);
                              
                    }


                 else{
                    for(int i=2;i<=number/2;i++){
                              if(number % i == 0){
                                        isprime = false;
                                        break;
                              }
                    }
          }
          System.out.println(isprime);
          }
          
}
