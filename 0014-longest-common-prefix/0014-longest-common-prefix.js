/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    
    if(strs.length == 0)    
        return "";
    
    let low = 0;
    let high = strs.reduce((minLength, str) =>Math.min(minLength, str.length - 1),Number.MAX_SAFE_INTEGER);

    while(low <= high)
    {
        let mid = Math.floor((low + high) / 2);

        if(compareStrings(strs, mid))
            low = mid + 1;
        else
            high = mid - 1;
    }

    return high >= 0 ? strs[0].slice(0, high + 1) : "";
};

function compareStrings(strs,mid)
{
    if(strs[0].length < mid)    
        return false;

    let prefix = strs[0].slice(0, mid + 1);

    for(let str of strs)
    {
        if(!str.startsWith(prefix))
            return false;
    }

    return true;
}