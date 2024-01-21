/**
 * @param {string} num
 * @return {string}
 */
var largestOddNumber = function(num) {
    
    let length = num.length; 

    for(let i = length - 1 ; i >= 0 ; i--)
    {
        if(num.charAt(i) % 2 == 1)
            return num.slice(0, i + 1);
    }

    return '';
};