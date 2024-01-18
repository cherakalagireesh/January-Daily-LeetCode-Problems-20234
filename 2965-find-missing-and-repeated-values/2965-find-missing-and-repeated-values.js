/**
 * @param {number[][]} grid
 * @return {number[]}
 */
var findMissingAndRepeatedValues = function(grid) {
    
    let freq = new Array(grid.length * grid[0].length + 1);
    freq.fill(0);
    let a = -1;
    let b = -1;

    grid.forEach(gr => {
        gr.forEach(el =>
        {
            freq[el]++;
        });
    });

    for(let i = 1 ; i < freq.length ; i++)
    {
        if(freq[i] == 2)
            a = i;
        if(freq[i] == 0)
            b = i;
    }
    
    return [a,b];
};