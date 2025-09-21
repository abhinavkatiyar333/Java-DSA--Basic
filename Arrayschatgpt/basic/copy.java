import java.util.Scanner;

public class copy {
          public static void main(String[] args) {
                    int arr1[] = { 2,5,3,7,4,1};
                    int arr2[] = new int[arr1.length];

                    for(int i=0; i<arr1.length; i++){
                              arr2[i] = arr1[i];
                    }

                    for(int i =0; i<arr2.length; i++){
                              System.out.print(arr2[i]+ " ");
                    }
          }
}
