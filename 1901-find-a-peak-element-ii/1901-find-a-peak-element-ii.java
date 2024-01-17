class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int low = 0;
        int colLength = mat[0].length;
        int high = colLength - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            int row = rowIndex(mat, mid);
            int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid + 1 < colLength ? mat[row][mid + 1] : -1;

            if(left < mat[row][mid] && right < mat[row][mid])
                return new int[]{row, mid};
            else if(left > mat[row][mid])
                high = mid - 1;
            else 
                low = mid + 1;
        }

        return new int[]{-1, -1};
    }

    public int rowIndex(int[][] mat, int col)
    {
        int max = -1;
        int index = -1;

        for(int i = 0 ; i < mat.length ; i++)
        {
            if(max < mat[i][col])
            {
                max = mat[i][col];
                index = i;
            }
        }

        return index;
    }
}