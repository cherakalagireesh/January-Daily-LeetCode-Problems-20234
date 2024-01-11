class Solution {
    public boolean makeEqual(String[] words) {
        
        int length = words.length;
        int [] frequency = new int[26];

        for(String word:words)
        {
            for(char ch:word.toCharArray())
            {
                frequency[ch - 'a']++;
            }
        }

        for(int i = 0 ; i < 26 ; i++)
        {
            int val = frequency[i];

            if(val != 0 && val % length != 0)
                return false;
        }

        return true;
    }
}