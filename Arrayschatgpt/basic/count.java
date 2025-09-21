import java.util.Scanner;

public class count {
          public static void oddEven(int arr[]){
                    int counteven = 0;
                    int countodd = 0;
                    for(int i=0 ; i<arr.length; i++){
                              if(arr[i]%2 == 0){
                                  counteven++;
                              }
                              else{
                                        countodd++;
                              }
                    }
                    System.out.println("The odd number is = "+ countodd );
                    System.out.println("The even number is = "+ counteven);
          }
          public static void main(String[] args) {
                    int arr[] = { 3,5,7,2,4,6,10};
                    oddEven(arr);
          }
          
}
