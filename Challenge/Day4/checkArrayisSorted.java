import java.util.*;

public class checkArrayisSorted {
          // check Array is sorted or not
          public static void main(String[] args) {
                    int num[] = {2,3,3,4};
                    boolean isSort = true;
                    for(int i=1;i<num.length;i++){
                              if(num[i]<num[i-1]){
                                        isSort  = false;
                                        break;
                                }
                    }
                    System.out.println(isSort);


          }
}
