class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length() <= 1)
            return s;

        int length = s.length();
        String LPS = "";
        int low = 0;
        int high = 0;

        for(int i = 1 ; i < length ; i++)
        {
            low = i;
            high = i;

            while(s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;

                if(low == -1 || high == length)
                    break;
            }

            if(s.substring(low + 1, high).length() > LPS.length())
                LPS = s.substring(low + 1, high);

            low = i - 1;
            high = i;

            while(s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;

                if(low == -1 || high == length)
                    break;
            }

            if(s.substring(low + 1, high).length() > LPS.length())
                LPS =  s.substring(low + 1, high);
        }

        return LPS;
    }
}