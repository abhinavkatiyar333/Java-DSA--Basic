import java.util.*;

public class findDublicate {
          // Find dublicate in an array
          public static void main(String[] args) {
                    int num[] = { 2,3,6,3,7};
                    for(int i=0;i<num.length;i++){
                              for(int j=i+1;j<num.length;j++){
                                        if(num[i]== num[j]){
                                                  System.out.println(num[i]);
                                                  break;
                                        }
                              }
                          
                    }
          }
          
}
