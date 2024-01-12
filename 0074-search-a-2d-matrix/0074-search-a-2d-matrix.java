class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int low = 0; 
        int high = (rowLength * colLength) - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            int rowIndex = (int)(Math.ceil(mid / colLength));
            int colIndex = mid % colLength;
            int num = matrix[rowIndex][colIndex];
            if(num == target)
                return true;
            else if(num > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return false;
    }
}