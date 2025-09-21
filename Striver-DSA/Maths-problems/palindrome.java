import java.util.*;

public class palindrome {
          public static void main(String[] args) {
                    System.out.println("Inter an number");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int origional = n;
                    int rev = 0;

                    if (n < 0) {
                              System.out.println("not a palindrome numbere");
                    } else {
                              while (n > 0) {
                                        int digits = n % 10;
                                        n = n / 10;
                                        rev = (rev * 10) + digits;

                              }
                    }
                    if (origional == rev) {
                              System.out.println("Yes , it is a palindrome number");
                    } else {
                              System.out.println("Not, a palindrome number");
                    }
          }

}
