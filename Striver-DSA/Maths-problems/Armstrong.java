import java.util.*;

public class Armstrong {
          public static void main(String[] args) {
                    System.out.println("enter an number");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int original = n;
                    int compr = 0;

                    int countd = String.valueOf(n).length();
                    if (n < 0) {
                              System.out.println("not a Armstrong number");

                    } else {
                              while (n > 0) {
                                        int digit = n % 10;
                                        compr += Math.pow(digit, countd);
                                        n = n / 10;
                              }
                              System.out.println(compr);
                    }

                    if (original == compr) {
                              System.out.println(" it , is a palindrome number");
                    } else {
                              System.out.println("not, a palindrome number");
                    }
          }
}
