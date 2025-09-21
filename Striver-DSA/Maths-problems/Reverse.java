import java.util.*;

public class Reverse {
          public static void main(String[] args) {
                    System.out.println("Enter an number");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();

                    int rev = 0;

                    if(n==0){
                              System.out.println(n);
                    }
                    else{
                              while(n>0){
                                        int digits = n%10;
                                         n = n/10;
                                        rev = (rev*10)+digits;
                              }
                    }
                    System.out.println(rev);
          }

}
