import java.util.Scanner;

public class palindrome {
          public static void main(String[] args) {
                    int number[] = { 1, 2, 3, 4, 3, 2, 1 };
                    int start = 0;
                    int end = number.length - 1;
                    boolean ispalindrome = true;
                    while (end > start) {
                              if (number[start] != number[end]) {
                                        ispalindrome = false;
                                        break;

                              }
                              start++;
                              end--;
                    }

                    if (ispalindrome == false) {
                              System.out.println("it is not a palindrome number");
                    } else {
                              System.out.println("it is a palindrome number");
                    }

          }

}
