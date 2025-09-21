import java.util.Scanner;
public class subsel {
          public static void findsubset(String str , String ans, int i){
 
                    if(i== str.length()){
                              System.out.println(ans);
                              return;
                    }

                    // choice yes
                    findsubset(str , ans+str.charAt(i), i+1);
                    // coice no
                    findsubset(str, ans, i+1);
          }
          public static void main(String[] args) {
                    String str = "abc";
                    findsubset(str," ", 0);
                    
          }
          
}
