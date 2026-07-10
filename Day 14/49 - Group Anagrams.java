/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]

*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i = 0; i < strs.length; i++)
        {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String k = new String(ch);

            if(!hm.containsKey(k))
            {
                hm.put(k, new ArrayList<>());
            }

            hm.get(k).add(strs[i]);
        }

        return new ArrayList<>(hm.values());
    }
}