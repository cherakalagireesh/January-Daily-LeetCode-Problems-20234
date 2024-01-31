/**
 * @param {string} s
 * @return {number}
 */
var beautySum = function(s) {
    let length = s.length;
    let maxVal = Number.MIN_SAFE_INTEGER;
    let minVal = Number.MAX_SAFE_INTEGER;
    let result = 0;
    let freq = new Array(26).fill(0);

    for(let i = 0 ; i < length ; i++)
    {
        for(let j = i ; j < length ; j++)
        {
            freq[s[j].charCodeAt(0) - 'a'.charCodeAt(0)]++;

            for(let el of freq)
            {
                if(el !== 0)
                {
                    maxVal = Math.max(maxVal, el);
                    minVal = Math.min(minVal, el);
                }
            }

            result += maxVal - minVal;
            maxVal = Number.MIN_SAFE_INTEGER;
            minVal = Number.MAX_SAFE_INTEGER;
        }

        freq.fill(0);
    }

    return result;
};