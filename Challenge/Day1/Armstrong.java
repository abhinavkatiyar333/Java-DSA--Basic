import java.util.*;

public class Armstrong {
          public static void main(String[] args) {
                    int number = 153;
                    int sum =0;
                    int count = String.valueOf(number).length();
                    int original = number;
                    boolean   isArmstrong = true;

                    while(number!=0){
                              int num = number%10;
                              sum  += Math.pow(num,count);
                              number = number/10;

                    }
                     if(sum == original){
                              isArmstrong = true;
                              
                    }else{
                              isArmstrong= false;
                    }

                    System.out.println(isArmstrong);

                    
          }
          
}
