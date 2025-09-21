import java.util.*;

public class GcdAndHcfr {
          public static void main(String[] args) {
                    int N1 = 18;
                    int N2 = 12;

                    for (int i = 1; i <= Math.min(N1, N2); i++) {
                              if ((N1 % i == 0) && (N2 % i == 0)) {
                                      System.out.print(i+ "  ");
                              }
                    }
          }

}
