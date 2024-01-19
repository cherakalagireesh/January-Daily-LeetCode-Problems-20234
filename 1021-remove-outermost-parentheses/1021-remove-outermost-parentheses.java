class Solution {
    public String removeOuterParentheses(String s) {
        
        String result = "";
        int count = 0;
        int length = s.length();

        for(int i = 0 ; i < length ; i++)
        {
            char ch = s.charAt(i);

            if( ch == '(')
                count++;
            else
                count--;
            
            if(count != 0  && (count != 1 || (count == 1 && ch == ')')))
            {
                result = result + ch;
            }
        }

        return result;
    }
}