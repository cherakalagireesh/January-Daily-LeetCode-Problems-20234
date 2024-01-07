class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;
        int oddAns = -1;
        int evenAns = -1;
        int count = 0;
        int medianIndex = (length1 + length2) % 2 == 0 ? (length1 + length2)/2 : (length1 + length2) / 2 + 1;
        int left = 0;
        int right = 0;

        while(left < length1 &&  right < length2)
        {
            if(nums1[left] < nums2[right])
            {
                count++;
                
                if(count == medianIndex)
                {
                    oddAns = nums1[left];
                    evenAns = nums1[left];
                }
                if(count - 1 == medianIndex)
                {
                    evenAns += nums1[left];
                    break;
                }

                left++;
            }
            else
            {
                count++;
                
                if(count == medianIndex)
                {
                    oddAns = nums2[right];
                    evenAns = nums2[right];
                }
                if(count - 1 == medianIndex)
                {
                    evenAns += nums2[right];
                    break;
                }

                right++;
            }
        }

        while(left < length1)
        {
            count++;
                
            if(count == medianIndex)
            {
                oddAns = nums1[left];
                evenAns = nums1[left];
            }
            if(count - 1 == medianIndex)
            {
                evenAns += nums1[left];
                break;
            }

            left++;

        }

        while(right < length2)
        {
             count++;
                
            if(count == medianIndex)
            {
                oddAns = nums2[right];
                evenAns = nums2[right];
            }
            if(count - 1 == medianIndex)
            {
                evenAns += nums2[right];
                break;
            }

            right++;
        }

        return (length1 + length2) % 2 == 0 ? (double)(evenAns) / 2.0: oddAns;

    }
}