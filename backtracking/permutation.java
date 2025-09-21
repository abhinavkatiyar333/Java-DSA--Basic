import java.util.Scanner;
public class permutation {
          public static void findallpermutation(String str , String ans){
                    // base case
                    if(str.length()== 0){
                              System.out.println(ans);
                              return;
                    }

                    // recursion 
                    for(int i= 0; i<str.length();i++){
                              char curr = str.charAt(i);
                              // "abcde" =>  "ab" + "de" = "abde"
                              str = str.substring(0 , i) + str.substring(i+1);
                              findallpermutation(str, ans+curr);
                    }
                     
          }
          public static void main(String[] args) {
               String str = "abc"  ;  
               findallpermutation(str, ""); 
               

          }
          
}
