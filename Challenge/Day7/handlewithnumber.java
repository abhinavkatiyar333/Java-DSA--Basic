import java.util.*;

public class handlewithnumber {

          // Handle Vowels and consonant with other number
          public static void main(String[] args) {
                    String name = "Abhinav katiyar333?";
                    name = name.toLowerCase();
                    int vowels = 0;
                    int consonants = 0;

                    for(int i=0;i<name.length();i++){
                              if(name.charAt(i) >= 'a'  && name.charAt(i)<= 'z'){
                                        if(name.charAt(i)== 'a' ||name.charAt(i)== 'e' || name.charAt(i)== 'i' ||name.charAt(i)== 'o' ||name.charAt(i)== 'u' ){
                                        vowels++;
                              }else{
                                   consonants++;
                              
                              }
                    }


          }

          System.out.println("vowels is := "+ vowels +" consonants is := "+consonants);

         }
          
}
