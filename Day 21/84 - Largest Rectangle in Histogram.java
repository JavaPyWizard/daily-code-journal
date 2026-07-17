/*
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:


Input: heights = [2,4]
Output: 4
 


*/

class Solution{
    public int largestRectangleArea(int[] heights)
    {
        int n = heights.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++)
        {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i])
            {
                st.pop();
            }

            if(st.isEmpty())
                left[i] = -1;
            else
                left[i] = st.peek();

            st.push(i);
        }

        st.clear();

        for(int i = n - 1; i >= 0; i--)
        {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i])
            {
                st.pop();
            }

            if(st.isEmpty())
                right[i] = n;
            else
                right[i] = st.peek();

            st.push(i);
        }

        int maxArea = 0;

        for(int i = 0; i < n; i++)
        {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}