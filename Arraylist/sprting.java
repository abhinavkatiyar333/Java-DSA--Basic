import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class sprting {
          public static void main(String[] args) {
             ArrayList<Integer> list = new  ArrayList<>();  
             list.add(2)  ;
             list.add(7) ;
             list.add(4) ;
             list.add(9) ;
             list.add(12) ;
             list.add(7) ;

             // use for sort in inbuild function  * Collections.sort()
             
             System.out.println("before short");
              System.out.println(list );


             Collections.sort(list);
             System.out.println("after sort  in asending order");
             System.out.println(list);

             System.out.println("if short  in desending order");
             Collections.sort(list , Collections.reverseOrder());
             System.out.println(list);
                 
          }
          
}
