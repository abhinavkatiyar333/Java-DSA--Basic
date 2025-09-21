import java.util.Scanner;
public class palindrome {
          public static void main(String[] args) {
                    int number[] = {1,2,3,4,4,3,2,9};
                    int start =0;
                    int end = number.length-1;
                    boolean ispalindrome = true;

                    while(end>start){
                              if(number[start]!=number[end]){
                                        ispalindrome = false;
                               break;
                              }      
                              start++;
                              end--;     
                    }
                    if(ispalindrome == false){
                              System.out.println("Not a palindrome number");
                    }
                    else{
                              System.out.println("yes It is a palindrome number");
                    }
                    
                   
          }
}
