import java.util.*;
                             // Insertion Sort
public class Insertionsort {
          // Select Minimum and Swap
          public static void main(String[] args) {
                    int Arr[] = {2,4,7,1,8,0};

                    for(int i=0;i<Arr.length;i++){
                              for(int j=i;j<Arr.length;j++){
                                        if(Arr[i]> Arr[j]){
                                                  int temp = Arr[i];
                                                  Arr[i] = Arr[j];
                                                  Arr[j] = temp;
                                        }
                                        System.out.println();
                              }
                    }
                    for(int i=0;i<Arr.length;i++){
                              System.out.print(Arr[i]+" ");
                    }

          }
          
}
