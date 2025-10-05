import java.util.*;

public class RightRotate {
          public static void Reverse(int num[], int start,int end ){
             
             
              while(start <= end){
                 int temp     =  num[start] ;
                 num[start]   =  num[end];
                 num[end]     =  temp;
                 start++;
                 end--;

             }

          }
          public static void Print(int num[]){
             for(int i=0;i<num.length;i++){
                    System.out.print(num[i]+ " ");
             }
          }


          
          public static void main(String[] args) {
                    int num[] = { 1,2,3,4,5,6};
                    int n= num.length-1;
                    int d = 3;

                   
                    Reverse(num, 0, n);
                    
                    Print(num);
                    System.out.println();
                    Reverse(num, 0, d-1);
                    Print(num);
                    System.out.println();
                     Reverse(num, d, n);
                     Print(num);



                    

          }
}
