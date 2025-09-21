import java.util.*;

public class printton {

          void print(int m , int n){
                    if(m>n){
                              return;
                    }
                    else{
                              System.out.print(m +" ");
                              
                              print(m+1 , n);
                    }
          }
          public static void main(String[] args) {
                    System.out.print("Enter an start number =");
                    Scanner sc = new Scanner(System.in);
                    int m = sc.nextInt();
                    System.out.print("Enter an last number =");
                    int n = sc.nextInt();

                    printton p1 = new printton();
                    p1.print(m ,n);


          }
          
}
