import java.util.Scanner;
public class prasubset {
          public static void printsubset(String str, String ans, int i){
                    if( i== str.length()){
                              System.out.println(ans);
                              return;
                    }

                    // choice yes
                    printsubset(str, ans+str.charAt(i), i+1);
                    //choice no
                    printsubset(str, ans, i+1);
          }
          public static void main(String[] args) {
                    String str = "abs";
                    printsubset(str, "", 0);
          }
          
}
