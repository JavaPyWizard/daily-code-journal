/*
Problem: Given an array of integers, rotate the array to the right by k positions.

Input:
- First line: integer n
- Second line: n integers
- Third line: integer k

Output:
- Print the rotated array

Example:
Input:
5
1 2 3 4 5
2

Output:
4 5 1 2 3
*/

#include <stdio.h>

void rotate(int nums[], int n, int k)
{
    k = k % n;

    int ans[n];

    for(int i = 0; i < n; i++)
    {
        ans[(i + k) % n] = nums[i];
    }

    for(int i = 0; i < n; i++)
    {
        nums[i] = ans[i];
    }
}

int main()
{
    int n, k;

    scanf("%d", &n);

    int nums[n];

    for(int i = 0; i < n; i++)
    {
        scanf("%d", &nums[i]);
    }

    scanf("%d", &k);

    rotate(nums, n, k);

    for(int i = 0; i < n; i++)
    {
        printf("%d ", nums[i]);
    }

    return 0;
}