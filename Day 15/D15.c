/*
Problem: Given a matrix, calculate the sum of its primary diagonal elements. The primary diagonal consists of elements where row index equals column index.

Input:
- First line: two integers m and n
- Next m lines: n integers each

Output:
- Print the sum of the primary diagonal elements

Example:
Input:
3 3
1 2 3
4 5 6
7 8 9

Output:
15

Explanation:
1 + 5 + 9 = 15

*/

#include<stdio.h>
int diagonalSum(int m, int n, int arr[m][n])
{
    int sum = 0;

    for(int i = 0; i < m && i < n; i++)
    {
        sum += arr[i][i];
    }

    return sum;
}
int main()
{
    int m,n;
    // int sum=0;
    scanf("%d %d",&m,&n);
    int arr[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&arr[i][j]);
            // if(i==j)
            //     sum+=arr[i][j];
        }
    }

    printf("%d",diagonalSum(m,n,arr));
    return 0;
}