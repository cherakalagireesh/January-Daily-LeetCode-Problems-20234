/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    
    let ans = s
    .trim()
    .split(/\s+/)
    .reduce((result, word) => {
      return word + " " + result;
    }, "");

  return ans.slice(0, ans.length - 1);
};