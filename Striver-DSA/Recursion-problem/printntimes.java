import java.util.*;

public class printntimes {
          int i=0;
         void print(){
          if(i==5){
                    return;
          }else{
                    System.out.println("Abhinav katiyar");
                    i++;
                    print();
          }

         }
              public static void main(String[] args) {
                    printntimes p1 = new printntimes();
                    p1.print();
                    
          }
          
}
