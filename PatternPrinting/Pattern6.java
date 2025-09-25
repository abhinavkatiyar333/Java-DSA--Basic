// left decreasing patten

public class Pattern6 {
          public static void main(String[] args) {
                    int n=6;
                    for(int i=1;i<n;i++){
                              for(int j=1;j<=2*i;j++){
                                        System.out.print("  ");
                              }
                              for(int k=n;k>i;k--){
                                        System.out.print("* ");
                              }
                              System.out.println();
                    }
          }
          
}
