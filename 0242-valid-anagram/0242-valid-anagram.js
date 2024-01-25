/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {

    if(s.length != t.length)    
        return false;

    let freq = new Array(26).fill(0);

    for(let i = 0 ; i < s.length ; i++)
    {
        let ch1 = s.charAt(i);
        let ch2 = t.charAt(i);

        freq[ch1.charCodeAt(0) - "a".charCodeAt(0)]++;
        freq[ch2.charCodeAt(0) - "a".charCodeAt(0)]--;
    }

    for(let i = 0 ; i < 26 ; i++)
    {
        if(freq[i] != 0)
            return false;
    }

    return true;
};