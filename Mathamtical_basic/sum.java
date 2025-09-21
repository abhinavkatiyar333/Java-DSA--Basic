import java.util.*;
public class sum {
          public static void main(String[] args) {
                    System.out.println("Enter an number");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int sum =0;

                    if(n<0){
                              n = Math.abs(n);
                             // System.out.println(n);
                    }

                    if(n==0){
                              sum += 0;
                    }
                    else{
                              while (n>0) {
                                         int digit = n%10;
                                        sum+= digit;
                                        n = n/10;
                                        
                              }
                              System.out.println(sum);
                              sc.close();

                    }
          }
          
}
