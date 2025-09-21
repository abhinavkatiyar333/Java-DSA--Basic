import java.util.*;

public class first {
          int count = 0;

          void print() {

                    if (count >= 4) {
                              return;
                    } else {
                              System.out.println(count);
                              count++;
                              print();

                    }
          }

          public static void main(String[] args) {
                    first p1 = new first();
                    p1.print();

          }

}
