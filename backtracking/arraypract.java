public class arraypract {

          public static int function( int n){
                    // base case
                    if(n==0 || n==1){

                       return n;


                    }

                    int fact =  n*function(n-1);
                    return fact;
               
                    
          }


          public static void main(String[] args) {
                   int n =5;   
                   System.out.println( function(n));
          }
}
