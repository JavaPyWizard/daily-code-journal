/*
Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
Example 3:

Input: s = "abc"
Output: 1
 
*/

// Approach 1 (Not Optimal Because it'll require both space & time for larger inputs)
/*
class Solution 
{
    public String[] substrings(String s)
    {
        int n = s.length();
        int total = n * (n + 1) / 2;

        String[] subs = new String[total];
        int index = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j <= n; j++)
            {
                subs[index] = s.substring(i, j);
                index++;
            }
        }

        return subs;
    }

    public int numberOfSubstrings(String s) 
    {
        String str[] = substrings(s);
        int a=0,b=0,c=0,counter=0;
        for (int i=0;i<str.length;i++)
        {
            a=0;b=0;c=0;
            String word = str[i];
            for(int j=0;j<word.length();j++)
            {
                if (word.charAt(j)=='a' || word.charAt(j)=='A' )
                    a++;
                if (word.charAt(j)=='b' || word.charAt(j)=='B' )
                    b++;
                if (word.charAt(j)=='c' || word.charAt(j)=='C' )
                    c++;
            }
            if(a>=1 && b>=1 && c>=1)
                counter++;
        }

        return counter;
    }
}
*/

// Approach 2 (Sliding Window/2 Pointer)
class Solution 
{
    public int numberOfSubstrings(String s) 
    {

        int[] count = new int[3];
        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) 
        {

            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) 
            {

                ans += s.length() - right;

                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return ans;
    }
}