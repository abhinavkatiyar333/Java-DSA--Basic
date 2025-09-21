import java.util.*;

public class findrowwithmax1 {
          int martix[][] = {{0,0,1,1,1},
                            {0,0,0,0,0},
                            {0,1,1,1,1},
                            {0,1,1,1,1}
                           }

            int row = martix.length;
            int col = matrix[0].length-1;
            
            int maxcount = 0;
            int rowcount = -1;
            for(int i=0;i<row; i++){
                    int countone = 0;
                    for(int j=0; j<col;j++){
                              if(matrix[i][j]==1){
                                        countone++;

                              }
                    }
                    if(countone>maxcount){
                              maxcount = rowcount;
                              rowcount =i;
                    }
                    System.out.println(rowcount);
                    
            }

          
}
