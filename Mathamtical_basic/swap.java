import java.util.Scanner;
public class swap {
          public static void main(String[] args) {
                    System.out.println("Enter the first number");
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    System.out.println("Enter a Second number");
                    int b = sc.nextInt();

                    int temp = a;
                    a = b;
                    b = temp;
                    System.out.println("after swap");
                    System.out.println("value of first number: = " + a);
                    System.out.println("value of second number: = "+ b);
          }
          
}
