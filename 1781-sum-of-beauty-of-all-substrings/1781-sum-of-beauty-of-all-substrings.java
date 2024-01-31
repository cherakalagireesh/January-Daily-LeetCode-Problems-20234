class Solution {
    public int beautySum(String s) {

        int length = s.length();
        int result = 0;
        int freq[] = new int[26];
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for(int i = 0 ; i < length ; i++)   
        {
            for(int j = i ; j < length ; j++)
            {
                freq[s.charAt(j) - 'a']++;
                
                for(int k = 0 ; k < 26 ; k++)
                {
                    if(freq[k] != 0)
                    {
                        maxVal = Math.max(maxVal, freq[k]);
                        minVal = Math.min(minVal, freq[k]);
                    }
                }

                result += maxVal - minVal;
                maxVal = Integer.MIN_VALUE;
                minVal = Integer.MAX_VALUE;
            }

            Arrays.fill(freq,0);
        }

        return result;
    }
}