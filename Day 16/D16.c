/*
Problem: Given an array of integers, count the frequency of each distinct element and print the result.

Input:
- First line: integer n (size of array)
- Second line: n integers

Output:
- Print each element followed by its frequency in the format element:count

Example:
Input:
5
1 2 2 3 1

Output:
1:2 2:2 3:1
*/

#include<stdio.h>
void freq(int m, int arr[])
{
    for(int i = 0; i < m; i++)
    {
        int count = 1;

        int found = 0;
        for(int k = 0; k < i; k++)
        {
            if(arr[k] == arr[i])
            {
                found = 1;
                break;
            }
        }

        if(found)
            continue;

        for(int j = i + 1; j < m; j++)
        {
            if(arr[i] == arr[j])
                count++;
        }

        printf("%d:%d ", arr[i], count);
    }
}

int main()
{
    int m;
    scanf("%d",&m);
    int arr[m];
    for(int i=0;i<m;i++)
    {
        scanf("%d",&arr[i]);
    }

    freq(m,arr);
    return 0;
}