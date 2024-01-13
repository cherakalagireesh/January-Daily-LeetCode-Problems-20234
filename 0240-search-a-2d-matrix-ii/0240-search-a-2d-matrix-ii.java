class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int currRow = 0;
        int currCol = colLength - 1;
        
        while(currRow < rowLength && currCol >= 0)
        {
            int element = matrix[currRow][currCol];
            
            if(element == target)   
                return true;
            else if(element < target)
                currRow++;
            else
                currCol--;
        }
       
        return false;
    }
}