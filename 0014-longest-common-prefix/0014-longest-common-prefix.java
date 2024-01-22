class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0 )    
            return "";

        int low  = 0;
        int high = Integer.MAX_VALUE;
    
        for(String str : strs)
            high = Math.min(high, str.length() - 1);
        
        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(compareStrings(strs, mid))
                low = mid + 1;
            else
                high = mid - 1;
        }

        return high >= 0 ? strs[0].substring(0, high + 1) : "";
    }

    public boolean compareStrings(String[] strs, int mid)
    {
        if(strs[0].length() < mid)
                return false;
        
        String prefix = strs[0].substring(0, mid + 1);

        for(String str : strs)
        {
            if(!str.startsWith(prefix))
                return false;
        }

        return true;
    }
}