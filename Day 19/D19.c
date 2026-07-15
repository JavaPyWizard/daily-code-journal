/*
Problem: Given an array of integers, find two elements whose sum is closest to zero.

Input:
- f line: integer n
- s line: n space-separated integers

Output:
- Print the pair of elements whose sum is closest to zero

Example:
Input:
5
1 60 -10 70 -80

Output:
-10 1

Explanation: Among all possible pairs, the sum of -10 and 1 is -9, which is the closest to zero compared to other pairs.
*/

#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b)
{
    return (*(int *)a - *(int *)b);
}

int main()
{
    int n;
    scanf("%d", &n);

    int arr[n];

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    qsort(arr, n, sizeof(int), compare);

    int start = 0;
    int end = n - 1;

    int minSum = abs(arr[start] + arr[end]);
    int f = arr[start];
    int s = arr[end];

    while (start < end)
    {
        int sum = arr[start] + arr[end];

        if (abs(sum) < minSum)
        {
            minSum = abs(sum);
            f = arr[start];
            s = arr[end];
        }

        if (sum < 0)
        {
            start++;
        }
        else
        {
            end--;
        }
    }

    printf("%d %d\n", f, s);

    return 0;
}
