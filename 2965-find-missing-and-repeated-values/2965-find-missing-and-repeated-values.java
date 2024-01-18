class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length;
        int []freq = new int[n * n + 1];
        int a = -1;
        int b = -1;

        for(int nums[] : grid)
        {
            for(int num : nums)
            {
                freq[num]++;
            }
        }

        for(int i = 1 ; i < freq.length ; i++)
        {
            if(freq[i] == 2)
                a = i;
            if(freq[i] == 0)
                b = i;

            if(a != -1 && b != -1)
                break;
        }

        return new int[]{a,b};
    }
}