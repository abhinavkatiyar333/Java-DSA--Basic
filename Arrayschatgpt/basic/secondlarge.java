import java.util.Scanner;

public class secondlarge {
          public static void main(String[] args) {
                    int arr[] = { 33,5,7,2,9};

                    int largest = Integer.MIN_VALUE;
                    int secondlarge = Integer.MIN_VALUE;

                    for(int i=0; i<arr.length; i++){
                              if(arr[i]>largest){
                                        secondlarge = largest;
                                        largest = arr[i];
                              }
                              else if(arr[i] > secondlarge && arr[i]! = largest){
                                        secondlarge = arr[i];
                              }
                    }
                    
          }
          
}
