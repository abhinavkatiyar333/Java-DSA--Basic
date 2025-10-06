import java.util.*;
           // Search a element in an ARRAY

public class SearchAelement {
          public static void main(String[] args) {
                    int num[] = { 1,3,5,7,4};
                    int n = 4;

                    for(int i=0;i<num.length;i++){
                              if(num[i]== n){
                                        System.out.println("element at index := "+ i);
                                        break;
                              }
                    }
          }
          
}
