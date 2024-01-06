class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int length = matrix.length;
        int temp[] = new int[length * length];
        int index = 0;

        for(int nums[]:matrix)
        {
            for(int num:nums)
            {
                temp[index++] = num;
            }
        }

        Arrays.sort(temp);

        return temp[k-1];
    }
}