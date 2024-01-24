/**
 * @param {string} s
 * @param {string} goal
 * @return {boolean}
 */
var rotateString = function(s, goal) {
    
    let left = 0;
    let right = s.length - 1;
    s = s + s;
    
    while(right < s.length)
    {
        let str = s.slice(left, right + 1);
        
        if(str === goal)
            return true;
        
        left++;
        right++;
    }
    
    return false;
};