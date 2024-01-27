/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function(s) {
    
    let count = 0;

    return s.split("").reduce((result, el)=>{
        if(el === '(')
            count++;
        if(el === ')')
            count--;
        
        return Math.max(result, count);
    },0);
};