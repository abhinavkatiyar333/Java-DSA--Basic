import java.util.*;

public class printnto1 {

              void Print(int n){
                    if(n<1){
                              return;
                    }else{
                              System.out.print(n + " ");
                              Print(n-1);
                    }
              }

          public static void main(String[] args) {
                    System.out.print("Enter the value of n = ");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    printnto1 p1 = new printnto1();
                    p1.Print(n);


          }
          
}
