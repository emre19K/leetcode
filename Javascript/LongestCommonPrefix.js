/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
*/

var longestCommonPrefix = function (strs) {
    if (strs.length < 1) return "";
    let i = 0;
    let prefix = "";
    while (strs[0][i] && strs.every(w => w[i] === strs[0][i])) {
        i++;
        prefix += strs[0][i - 1];
    }
    return prefix;
};