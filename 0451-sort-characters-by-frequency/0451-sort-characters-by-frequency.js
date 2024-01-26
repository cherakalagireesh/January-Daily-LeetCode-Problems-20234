/**
 * @param {string} s
 * @return {string}
 */
var frequencySort = function(s) {

    let freq = new Array(256).fill(0);
    let buckets = new Array(s.length + 1);
    let result = "";

    for(let i = 0 ; i <= s.length ; i++)
        buckets[i] = [];

    for(let ch of s)
    {
        freq[ch.charCodeAt(0)]++;   
    }

    for(let i = 0 ; i < 256 ; i++)
    {
        buckets[freq[i]].push(String.fromCharCode(i));
    }

    for(let i = buckets.length - 1 ; i >= 0 ; i--)
    {
        if(buckets[i])
        {
            buckets[i].forEach(el =>
            {
                result += el.repeat(i);
            })
        }
    }

    return result;
};