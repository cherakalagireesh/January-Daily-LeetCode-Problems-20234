class Solution {
    public boolean rotateString(String s, String goal) {
        
        int length = s.length();
        s = s + s;

        for(int i = 0 ; i < length ; i++)
        {
            if(s.substring(i, i + length).equals(goal))
                return true;
        }

        return false;
    }
}