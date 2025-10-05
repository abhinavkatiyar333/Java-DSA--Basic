public class Fibnaachi {

          public static int Fib(int n){
                    int sum =0;
                    if(n==0 || n==1){
                              return n;
                    }else{
                     sum =  Fib(n-1)+Fib(n-2);
                              return  sum;
                     
                    }
                   



          }
          public static void main(String[] args) 
          {  
                    int n =8;
           for(int i=0;i<n;i++){
                    System.out.println(Fib(i));

           }

                   
                    
          }
          
}
