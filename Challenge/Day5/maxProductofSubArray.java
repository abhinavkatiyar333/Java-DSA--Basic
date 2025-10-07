public class maxProductofSubArray {

            // max product of subarrray
          public static void main(String[] args) {
                    int num[] = {6,3,4,4,1,6,-1};
                   
                    int maxProduct = Integer.MIN_VALUE;

                    for(int i=0;i<num.length;i++){
                               int currProduct = 1;
                               for(int j=i;j<num.length;j++){
                              currProduct *= num[j];
                              if(currProduct>maxProduct){
                                        maxProduct = currProduct;
                              }
                    }
                              
                    }
                     System.out.println("Maximum Subarray Product is: " + maxProduct);
          }
          
}
