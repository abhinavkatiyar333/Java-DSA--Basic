import java.util.*;

public class Countdigits {
          public static void main(String[] args) {
                    System.out.println("Input an number");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int count = 0;

                    if(n==0){
                         count = 1;
                    }
                    else{
                              while(n>0){
                                 //  int digits = n%10;
                                   count = count+1;
                                   n = n/10;

                              }
                    }
                    System.out.println("Number of Digits is "+ count);
          }

}
