import java.util.*;

public class BettetrApproach {
          public static void main(String[] args) {
                    int arr[] = { 6 ,3,1,8,8,2,9,10,10};
                    int n = arr.length;
                    // first find largest ellement
                    int largest = arr[0];
                    for(int i=0; i<n; i++){
                              if(arr[i]>largest){
                                        int temp = arr[i];
                                        arr[i] = largest;
                                        largest = temp;
                              }
                    }
                    System.out.println("Largest value is : ="+largest);



                    int secondlargest = -1;
                    for(int i=0; i<n;i++){
                              if(arr[i]>secondlargest && arr[i] != largest){
                                        int temp2 = arr[i];
                                        arr[i] = secondlargest;
                                        secondlargest = temp2;
                              }
                    }
                    System.out.println("Second largest element is : = "+ secondlargest);
          }
          
}
