import java.util.Scanner;

public class countdigits {
          public static void main(String[] args) {
                    int count = 0;
                    int number = -234567;

                    number = Math.abs(number);// use for convert negative number to positive
                    System.out.println(number);

                    if (number == 0) {
                              count = 1;
                    } else {
                              while (number > 0) {
                                        number = number / 10;
                                        count++;
                              }
                    }
                    System.out.println(count);
          }

}
