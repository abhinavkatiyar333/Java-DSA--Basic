import java.util.*;
public class FindSmall {

        //  Find largest and smallest Character in a sentence.

          public static void main(String[] args) {
                    String name = "Abhinav Katiyar";
                    name = name.toLowerCase();

                    char maxchar = name.charAt(0);
                    char currchar = name.charAt(0);
                    char minchar = name.charAt(0);

                    for(int i=1;i<name.length();i++){
                              
                                  currchar = name.charAt(i);

                                  if (currchar == ' ') continue;


                              if(name.charAt(i)>name.charAt(i-1)){
                                        maxchar = currchar;
                              }
                              if(name.charAt(i)<name.charAt(i-1)){
                                        minchar = currchar;
                              }

                    }
                    System.out.println("Max word in string : = "+maxchar);
                    System.out.println("Min word in string : = "+minchar);

                   
          }
          
}
