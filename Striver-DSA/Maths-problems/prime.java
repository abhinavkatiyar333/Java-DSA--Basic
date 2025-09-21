import java.util.*;

public class prime {
          public static void main(String[] args) {
                    System.out.println("Enter an number");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    boolean isprime = true;

                    for(int i=2; i<n; i++){
                              if(n%i==0){
                                        isprime = false;
                                        break;
                              }
                             
                    }
                    if(isprime == false){
                              System.out.println("Not a prime number");
                    }
                    else{
                              System.out.println("it is a prime number");
                    }
          }
          
}
