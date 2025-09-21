import java.util.Scanner;
//package backtracking;
public class array {
public static void Changearr(int arr[] , int i, int val){
   // base case
   if(i== arr.length){
          print(arr);
          return;
   }
   // recursion
   arr[i] = val;
   Changearr(arr, i+1, val+1);// recursion
   arr[i] = arr[i]-1;

}


  public static void print(int arr[]){
          for(int i=0; i<arr.length;i++){
                    System.out.print(arr[i]+ " ");
          }
          System.out.println();
  }

          public static void main(String[] args) {
                    int arr[] = new int[5];
                    Changearr(arr,0,1);
                    print(arr);

          }
          
}
