import java.util.Scanner;

public class hollowrectangle {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter number of row : = ");
                    int n = sc.nextInt();
                    System.out.print("Enter number of column : = ");
                    int m = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                              for (int j = 0; j < m; j++) {
                                        if (i == 0 || i == n-1  || j == 0 || j == m-1) {
                                                  System.out.print("* ");
                                        }
                                        else{
                                                  System.out.print("  ");
                                        }
                              }
                              System.out.println();
                    }
          }

}
