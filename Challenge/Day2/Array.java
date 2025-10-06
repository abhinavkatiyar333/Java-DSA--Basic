package Challenge.Day2;
import java.util.*;

public class Array {
                   // Print all element in an Array
          public void print(int number[]){
                    for(int i=0;i<number.length;i++){
                              System.out.print(number[i]+" ");
                    }
          }

                   //  Print Max element in an Array

          public void maxnumber(int number[]){
                    int  max = Integer.MIN_VALUE;
                    for(int i=0;i<number.length;i++){
                              if(number[i]>max){
                                        max = number[i];
                              }


                    }
                    System.out.println(max);

                      //  Print Min element in an Array
          }
           public void minnumber(int number[]){
                    int  min = Integer.MAX_VALUE;
                    for(int i=0;i<number.length;i++){
                              if(number[i]<min){
                                        min = number[i];
                              }


                    }
                    System.out.println(min);
          }
          public static void main(String[] args) {
                    int number[] = {1,2,3,4,5,6};

                    Array ll = new Array();
                    ll.maxnumber(number);
                    ll.minnumber(number);
                    ll.print(number);
          }
                    
          
}
