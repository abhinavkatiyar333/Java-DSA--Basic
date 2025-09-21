import java.util.*;

public class Sumofnnumber {
             
          int print(int n){
                    if(n<0){
                              return  0;
                    }else{
                        return   n+print(n-1);
                    }
          }

          // factorial of n number
          int fact(int n){
                    if(n ==0 || n==1){
                              return 1;
                    }else{
                              return n*fact(n-1);
                    }
          }

          public static void main(String[] args) {
                    System.out.println("Enter the value of n = ");
                    Scanner  sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    
                   Sumofnnumber S1 = new Sumofnnumber();
                   int Totalsum =   S1.print(n);
                   int Totalfact = S1.fact(n);
                    System.out.println( S1.print(Totalsum));
                    System.out.println(S1.fact(Totalfact));

                    



          }
          
}
