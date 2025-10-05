import java.util.*;
public class StrongNumber {

          public static int fact(int num){
                    if(num==0 || num==1){
                              return 1;

                    }else{
                              return num*fact(num-1);
                    }
          }
          public static void main(String[] args) {
                    boolean isStrong = true;
                    int number = 145;
                    int original = number;
                    int sum = 0;

                    while(number!=0){
                              int num = number%10;
                              sum+= fact(num);
                              number = number/10;
                       }
               
                       if(original == sum){
                              isStrong = true;
                       }else{
                              isStrong = false;
                       }

                       System.out.println(isStrong);

          }
          
          
}
