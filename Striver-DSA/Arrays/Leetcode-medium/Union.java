import java.util.*;

public class Union {
          public static void main(String[] args) {
                    int arr1[] = {1,2,2,3,4};
                    int n = arr1.length;
                    int arr2[] = {3,4,5,6};
                    int m = arr2.length;

                    int arr3[] = new int[arr1.length+arr2.length];
                    int p = arr3.length;

                    for(int i=0;i<n;i++){
                              arr3[i] = arr1[i];

                    }
                    for(int i=n; i<p;i++){
                    
                              arr3[i] = arr2[i-n];
                             
                    }
                    

                    for(int i=0; i<p;i++){
                              boolean isDublicate = false;
                          for(int j= 0; j<i; j++){
                              if(arr3[i]== arr3[j]){
                                        isDublicate = true;
                                        break;
                                        
                              }
                          }
                    
                    if(! isDublicate){
                              System.out.print(arr3[i]+" ");
                    }
          }
          }

                   // System.out.println(arr3.length);

          }
          

