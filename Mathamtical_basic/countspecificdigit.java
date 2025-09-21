import java.util.Scanner;

public class countspecificdigit {
          public static void main(String[] args) {
                    System.out.println("Enter an number");
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    System.out.println("Enter the target digit");
                    int target = sc.nextInt();
                    int count = 0;
                    if(target <0 || target>9){
                              System.out.println("Please Enter than Single  target digits");
                              return;
                    }
                    number = Math.abs(number);
                    
                    if(number == 0  && target ==0){
                              count += 1;
                    }

                    while (number > 0) {
                              int digit = number % 10;
                              if (digit == target) {
                                        count++;
                              }
                              number = number /10;
                    }
                    System.out.println( "total number of "+target + " is found := "+count);

          }

}
