import java.util.Scanner;

public class sumall {
          public static void print(int arr[], int key){
                    for(int i =0; i<arr.length;i++){
                              if(arr[i]== key){
                                        System.out.println(i);
                              }
                    }

                   
          }
          public static void main(String[] args) {
                    int arr[] = {3 ,5, 6, 2,9};
                    int key =  6;
                    print(arr , key);
                    
          }
          
}
