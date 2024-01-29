class Solution {
    public int myAtoi(String s) {
        
        char sign = '+';
        int index = 0;
        int length = s.length();
        long result = 0;

        while(index < length && s.charAt(index) == ' ')
            index++;
        
        if(index < length && s.charAt(index) == '+')
            index++;
        else if(index < length && s.charAt(index) == '-')
        {
            sign = '-';
            index++;
        }

        while(index < length)
        {
            if(!Character.isDigit(s.charAt(index)))
                break;
            else if(sign == '+' && result > Integer.MAX_VALUE)
            {
                result = Integer.MAX_VALUE;
                break;
            }
            else if(sign == '-' && -result < Integer.MIN_VALUE)
            {
                result = Integer.MIN_VALUE;
                break;
            }
            else
            {
                result = result * 10 + (s.charAt(index) - '0');
            }

            index++;
        }
        
        if(sign == '+' && result > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        else if(sign == '-' && -result < Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;

        return sign == '-' ? -(int)(result) : (int)(result);
    }
}