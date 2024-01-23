/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    
    if(s.length != t.length)
        return false;
    
    let length = s.length;
    let charMappedMap = new Map();

    for(let i = 0 ; i < length ; i++)
    {
        let original = s.charAt(i);
        let replacement = t.charAt(i);

        if(!charMappedMap.has(original))
        {
            if(!checkValue(charMappedMap,replacement))
                charMappedMap.set(original, replacement);
            else
                return false;

        }
        else
        {
            let mappedChar = charMappedMap.get(original);

            if(mappedChar != replacement)
                return false;
        }
    }

    return true;
};

function checkValue(charMappedMap,replacement)
{
    for(let value of charMappedMap.values())
    {
        if(value == replacement)
            return true;
    }

    return false;
}