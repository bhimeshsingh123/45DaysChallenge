

class Solution {
    public void setZeroes(int[][] matrix) {
        int rowtrack[] = new int[matrix.length*matrix[0].length];
        int coltrack[] = new int[matrix.length*matrix[0].length];
        int zero = 0;
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               // System.out.println("("+i+","+j+")"+" = " +matrix[i][j]);
                if(matrix[i][j]==0){
                   rowtrack[zero] = i;
                   coltrack[zero] =j;
                   zero++;
                   count++;
                 }
            }
        }
        for(int i=0;i<count;i++){
           
            for(int row=0;row<matrix[0].length;row++){
              matrix[rowtrack[i]][row]=0;
            }
            for(int col=0;col<matrix.length;col++){
             matrix[col][coltrack[i]]=0;
            }
        }
    }
}
