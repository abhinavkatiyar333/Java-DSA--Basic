import java.util.*;

public class RemoveDublicate {
          // remove dublicateb from sorted array
          public static void main(String[] args) {
                  int arr[] =  { 2 , 2, 3,3,4,5,5,7,7};
                  int newArr[] = new int [arr.length];

                  int x =0;
                  newArr[0] = arr[0];
                
                  for(int i=1; i<arr.length; i++){
                    if(arr[i] != arr[i-1]){
                              x++;
                              newArr[x] = arr[i];
                    }
                  }
                  for(int i=0;i<x;i++){
                    System.out.print(newArr[i]+" ");
                  }


          }
}
