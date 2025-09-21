import java.util.*;

public class Stringpalindromeornot {
          public static void main(String[] args) {
                    String Original = "MADAM";
                    // String comp = Original;

                    int st = 0;
                    int end = Original.length() - 1;

                    for (int i = 0; i < Original.length(); i++) {
                              if (end >= st) {
                                        int temp = Original[st];
                                        Original[st] = Original[end];
                                        Original[end] = temp;
                                        end--;
                                        st++;
                              }
                              System.out.println(Original[i]);
                    }
          }

}
