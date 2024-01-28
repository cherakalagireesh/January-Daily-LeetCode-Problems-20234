/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {

    let result = 0;
    let map = new Map([
        ['I',1],
        ['V',5],
        ['X',10],
        ['L',50],
        ['C',100],
        ['D',500],
        ['M',1000]
     ]);

    result = map.get(s.charAt(s.length - 1));

    for(let i = s.length - 2 ; i >= 0 ; i--)
    {
        
        if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
            result-=map.get(s.charAt(i));
        else
            result+=map.get(s.charAt(i));            

    }

    return result;
};