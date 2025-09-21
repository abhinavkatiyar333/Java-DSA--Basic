import java.util.Scanner;

public class reverse {
          public static void main(String[] args) {
                    int number[] = {1,2,3,4,5,6,7};
                    int reverse[] = new int [number.length];

                    for(int i=0; i<number.length; i++){
                              reverse[i] = number[number.length-1-i];
                    }
                    for(int i=0; i<reverse.length; i++){
                              System.out.print(reverse[i]);
                    }

          }
}
