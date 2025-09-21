import java.util.*;

public class FirstApporach {
          public static void main(String[] args) {
                    int arr[] = {1,1,3,5,1,1};
                   int number = 1;
                   int count =0;

                   for(int i=0; i<arr.length;i++){
                       if(arr[i]== number){
                          count += 1;
                       }

                   }
                   System.out.println(count);
          }
}
