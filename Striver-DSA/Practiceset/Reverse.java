import java.util.*;

public class Reverse {
          public static void main(String[] args) {
                    int n = 123456789;

                    n = Math.abs(n);
                    int rev = 0;

                    if (n == 0) {
                              System.out.println(n);
                    } else {
                              while (n > 0) {
                                        int digits = n % 10;
                                        n = n / 10;

                                        rev = rev * 10 + digits;
                              }
                    }
                    System.out.print(rev + " ");
          }

}
