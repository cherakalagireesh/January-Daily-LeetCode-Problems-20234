class Solution {
    public int maxDepth(String s) {

        int count = 0;
        int result = 0;

        for(char ch : s.toCharArray())   
        {
            if(ch == '(')
                count++;
            if(ch == ')')
                count--;
            
            result = Math.max(result, count);
        }

        return result;
    }
}