public class minmax {
          public static void print(int arr[] ){
                    int n = arr.length;
                    // max
              int max = Integer.MIN_VALUE;  
              for(int i=0; i<n ; i++)  {
                    if(arr[i]> max){
                              max = arr[i];
                    }
                    
              }  
              System.out.println(max);
          }
          public static void print1(int arr[]){
                    int n = arr.length;
                    // max
              int min = Integer.MAX_VALUE;  
              for(int i=0; i<n ; i++)  {
                    if(arr[i]< min){
                              min = arr[i];
                    }
                    
              }  
              System.out.println(min);
          }
         public static void main(String[] args) {
          int arr[] = {33,50,2,6,90};
          print(arr);
          print1(arr);
          

         } 
}
