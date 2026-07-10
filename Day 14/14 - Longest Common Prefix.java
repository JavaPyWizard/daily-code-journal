/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
*/

class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        StringBuilder s=new StringBuilder("");
        for(int j=0;j<strs[0].length();j++)
        {
            for(int i=0;i<strs.length;i++)
            {
                if(j == strs[i].length() || strs[0].charAt(j) != strs[i].charAt(j))
                {
                    return s.toString();
                }
            }
            s.append(strs[0].charAt(j));
        }
        return s.toString();
    }
}