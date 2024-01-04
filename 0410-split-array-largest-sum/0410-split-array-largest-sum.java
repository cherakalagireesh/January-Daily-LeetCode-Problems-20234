class Solution {
    public int splitArray(int[] nums, int k) {
        
        if(k > nums.length) 
            return -1;

        long[] arr = findValues(nums);
        long low = arr[0];
        long high = arr[1];

        while( low <= high)
        {
            long mid = (low + high) / 2;

            if(countSubArrays(nums, mid) > k)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return (int)(low);
    }

    public long[] findValues(int nums[])
    {
        int max  = nums[0];
        long sum = 0;

        for(int num: nums)
        {
            max = Math.max(max, num);
            sum += num;
        }

        return new long[]{max, sum};
    }

    public int countSubArrays(int []nums, long max)
    {
        int partitionCount = 1;
        long currSum = 0;
        int length = nums.length;

        for(int i = 0 ; i < length ; i++)
        {
            if(currSum + nums[i] <= max)
                currSum += nums[i];
            else
            {
                partitionCount++;
                currSum = nums[i];
            }
        }

        return partitionCount;
    }
}