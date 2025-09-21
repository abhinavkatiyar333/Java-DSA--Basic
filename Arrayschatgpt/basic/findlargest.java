import java.util.Scanner;

public class findlargest {

          static void large(int n, int arr[]) {
                    int min = Integer.MAX_VALUE;
                    for (int i = 0; i < n; i++) {
                              if (min > arr[i]) {
                                        min = arr[i];
                              }
                    }
                    System.out.println("min value is " + min);
          }

          public static void main(String[] args) {
                    System.out.println("Enter the length of array");
                    Scanner sc = new Scanner(System.in);
                    int n =  sc.nextInt();

                    int arr[] = new int[n];
                    System.out.println("Enter the "+  n + " " + "Element");
                    for(int i =0; i<n;i++){
                              arr[i] = sc.nextInt();
                    }

                    large(n ,arr);
          }

}
