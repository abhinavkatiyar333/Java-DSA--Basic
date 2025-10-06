import java.util.*;

public class mergeToArray {

               // Merge Two Arrays
          public static void main(String[] args) {
                    int num1[] = { 1,2,3,4};
                    int num2[] = { 5,6,7,8};

                    int num3[] = new int[(num1.length)+ (num2.length)];

                    for(int i=0;i<num1.length;i++){
                              num3[i] = num1[i];
                    }
                    for(int i=0;i<num2.length;i++){
                              num3[i+num1.length] = num2[i];
                    }

                    // print Merge array
                    for(int i=0;i<num3.length;i++){
                              System.out.print(num3[i]+" ");
                    }
          }
          
}
