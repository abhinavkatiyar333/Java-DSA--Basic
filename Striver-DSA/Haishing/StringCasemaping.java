import java.util.*;

public class StringCasemaping {
          public static void main(String[] args) {
                    String name = "abhinavkatiyar";
                    char target = 'a';

                    // int hash[] = new int[26];
                    int hash[] = new int[256];

                    for (int i = 0; i < name.length(); i++) {
                              // hash[name.charAt(i)-'a']++;
                              hash[name.charAt(i)]++;
                    }
                    System.out.println(hash[target]);
                    // System.out.println(hash[target - 'a']);

          }

}
