class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        
        int result = 0;
        int length = nums.length;

        for(int i = 0 ; i < length ; i++)
        {
            for(int j = i ; j < length ; j++)
            {
                if(helper(0, i, nums) && helper( j+1, length, nums) && ( i-1 < 0 || j + 1 >= length || nums[i - 1] < nums[j+1]))
                    result++;
            }
        }

        return result;
    }

    public boolean helper(int start, int end, int[] nums)
    {
        while(start < end - 1)
        {
            if(nums[start] >= nums[start + 1])
                return false;
            
            start++;
        }

        return true;
    }

}