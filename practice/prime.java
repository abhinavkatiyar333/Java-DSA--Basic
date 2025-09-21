import java.util.Scanner;

public class prime {
          public static void main(String[] args) {
                    int n = 17;
                    boolean isprime = true;

                    if (n <= 1) {
                              System.out.println("not a prime number");
                    } else {
                              for (int i = 2; i <= Math.sqrt(n); i++) {
                                        if (n % i == 0) {
                                                  isprime = false;
                                                  break;
                                        }
                              }
                    }
                    if (isprime == true) {
                              System.out.println("it is  a prime number");
                    } else {
                              System.out.println("it is not a prime number");
                    }
          }

}
