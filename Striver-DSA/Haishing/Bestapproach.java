import java.util.*;

public class Bestapproach {
          public static void main(String[] args) {
                    int number[] = { 1, 2, 3, 4, 4, 2, 1, 1, 4, 4 };

                    int target = 4;

                    int hash[] = new int[5];

                    for (int i = 0; i < number.length; i++) {
                              hash[number[i]] += 1;
                    }

                    // System.out.println(hash[target]);
                    System.out.println("Count of " + target + " = " + hash[target]);

          }

}
