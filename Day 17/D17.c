/*
Problem: Write a program to find the maximum and minimum values present in a given array of integers.

Input:
- First line: integer n
- Second line: n integers

Output:
- Print the maximum and minimum elements

Example:
Input:
6
3 5 1 9 2 8

Output:
Max: 9
Min: 1
*/

#include<stdio.h>
void minmaxarray(int m,int arr[])
{
    int min=arr[0],max=arr[0];
    for(int i=1;i<m;i++)
    {
        if(min>arr[i])
            min=arr[i];
        if(max<arr[i])
            max=arr[i];
    }
    printf("Max: %d\nMin: %d",max,min);
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

    minmaxarray(m,arr);
    return 0;
}