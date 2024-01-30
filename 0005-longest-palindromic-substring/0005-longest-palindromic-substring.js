/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    
    let length = s.length;
    let low = 0;
    let high = 0;
    let LPS = "";
    if(length <= 1)
        return s;

    for(let i = 1 ; i < length ; i++)
    {
        low = i;
        high = i;

        while(s[low] === s[high])
        {
            low--;
            high++;

            if(low === -1 || high === length)
                break;
        }

        LPS = s.slice(low + 1, high).length > LPS.length ? s.slice(low + 1, high) : LPS;

        low = i - 1;
        high = i;

        while(s[low] === s[high])
        {
            low--;
            high++;

            if(low === -1 || high === length)
                break;
        }

        LPS = s.slice(low + 1, high).length > LPS.length ? s.slice(low + 1, high) : LPS;
    }

    return LPS;
};