class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length; int cols = matrix[0].length;
         int s = 0;
         int e = rows*cols-1;
         while(s<=e){
             int mid = s + (e-s)/2;
             int rowIndex = mid / cols;
             int colIndex = mid % cols;
             int element = matrix[rowIndex][colIndex];

             if(element == target){
                 return true;
             }else if(element < target){
                 s = mid + 1;
             }else{
                 e = mid - 1;
             }
         }
         return false;
        
    }
}
