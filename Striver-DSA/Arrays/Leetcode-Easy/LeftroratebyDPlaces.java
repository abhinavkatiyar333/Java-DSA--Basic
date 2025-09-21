import java.util.*;

public class LeftroratebyDPlaces {
          public static void main(String[] args) {
                    int arr[] = {1,2,3,4,5,6,7};
                    int d = 2;
                    int n = arr.length;
                    int temp[] = new int[d];

                    // store first d element in temp
                    for(int i= 0 ; i<d; i++){
                           temp[i] = arr[i];
                    }
                   
                    // shift for d place 
                    for(int i=0; i<n-d; i++){
                              arr[i] = arr[i+d];
                    }

                    // copy temp to store remainig place

                    for(int i = 0; i<d ; i++){
                              arr[n-d+i] = temp[i];
                    }
                    



                    for(int i=0; i<n; i++){
                              System.out.print(arr[i]+" ");
                    }

          }
          
}
