import java.util.*;

public class Gcd {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the First number = ");
                    int n1 = sc.nextInt();
                    System.out.print("Enter the Second number = ");
                    int n2 = sc.nextInt();


                    int gcd = 1;

                    for(int i=1; i<= Math.min(n1 , n2); i++){
                              if(n1 % i == 0 && n2%i == 0){
                                        gcd = i;
                              }
                    }
                   System.out.println("Gcd of " + n1 + " and " + n2 + " is: " + gcd);
                   




          }
          
}
