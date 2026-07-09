/*
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 


*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> li = new ArrayList<>();

        int top = 0, bottom = matrix.length - 1,left = 0,right = matrix[0].length - 1;

        while (top <= bottom && left <= right) 
        {

            for (int i = left; i <= right; i++) 
            {
                li.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) 
            {
                li.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) 
            {
                for (int i = right; i >= left; i--) 
                {
                    li.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) 
            {
                for (int i = bottom; i >= top; i--) 
                {
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }
        return li;
    }
}