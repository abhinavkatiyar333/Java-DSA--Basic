import java.util.*;

public class printalldevisiors {
          public static void main(String[] args) {
                    System.out.println("Enter an number");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                   // int count = 0;

                    for(int i =1; i<= n ; i++){
                            if(n % i == 0){
                              System.out.print(i + " ");
                            }
                    }
                    //System.out.println(count);
          }
          
}
