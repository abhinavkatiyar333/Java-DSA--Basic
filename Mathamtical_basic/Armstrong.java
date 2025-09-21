import java.util.Scanner;

public class Armstrong {

          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter an number");
                    int original = sc.nextInt();
                    int number = original;
                    int digits = String.valueOf(number).length();
                    System.out.println("Total number of digits =] "+digits);
                    int sum =0;

                    while(number>0){
                              int digit = number%10;
                              sum += Math.pow(digit, digits);
                              number = number/10;
                    }
                    if(sum == original){
                              System.out.println(original +" It is a palindrome number");
                    }
                    else{
                              System.out.println("Not a palindrome number");
                    }



          }
          
}
