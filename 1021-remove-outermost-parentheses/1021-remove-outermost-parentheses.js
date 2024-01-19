/**
 * @param {string} s
 * @return {string}
 */
var removeOuterParentheses = function(s) {
    
    let stack = [];

    return s.split('').reduce((result, char)=>{
        if(char === '(')
        {   
            if(stack.length > 0)
                result += char;
            
            stack.push(char);
        }
        else 
        {
            stack.pop();

            if(stack.length > 0)
                result += char;
        }

        return result;
    },'');
};