package Challenge.Day2;
import java.util.*;

public class SecondLarge {

               // find second largeElement in an ARRAY
          public static void main(String[] args) {
                    int num [] = {2,4,5,6,7,3};
                    int secondLarge = Integer.MIN_VALUE;

                    int max = Integer.MIN_VALUE;
                    for(int i=0;i<num.length;i++){
                              if(num[i]>max){
                                        max = num[i];
                              }
                    }

                     for(int i=0;i<num.length;i++){
                               if(num[i]>secondLarge  && num[i]<max){
                                        secondLarge = num[i];
                                }
                                }
                              
                   
                   
                   System.out.println(secondLarge);            



          }
          
}
