/**
 * @param {string} s
 * @return {number}
 */
var myAtoi = function(s) {
    
    let length = s.length;
    let index = 0;
    let result = 0; 
    let sign = '+';
    const MAX_VALUE = Math.pow(2, 31) - 1;
    const MIN_VALUE  = -Math.pow(2,31);

    while(index < length && s[index] == ' ')
        index++;
    
    if(s[index] === '+' || s[index] === '-')
    {
        sign = s[index];
        index++;
    }

    while(index < length)
    {
        if(isNaN(+s[index])|| s[index] === ' ')
            break;
        else if(sign === '+' && result > MAX_VALUE)
            return MAX_VALUE;
        else if(sign === '-' && -result < MIN_VALUE)
            return MIN_VALUE;
        else
            result = result * 10 + Number(s.charAt(index));

        index++;
    }

    if(sign === '+' && result > MAX_VALUE)
        return MAX_VALUE;
    else if(sign === '-' && -result < MIN_VALUE)
        return MIN_VALUE;

    return sign === '-' ? -result : result;
};