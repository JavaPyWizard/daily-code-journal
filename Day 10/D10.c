/*
Problem: Read a string and check if it is a palindrome using two-pointer comparison.

Input:
- Single line: string s

Output:
- Print YES if palindrome, otherwise NO

Example:
Input:
level

Output:
YES

Explanation: String reads same forwards and backwards
*/

#include<stdio.h>
#include<string.h>

void palindrome(char ch[])
{
    int l=0,r=strlen(ch)-1;
    while(l<r)
    {
        if(ch[l]!=ch[r])
        {
            printf("No");
            return;
        }
           l++;
           r--;
    }
    printf("Yes");
}
int main()
{
    char ch[100];

    scanf("%s", ch);

    palindrome(ch);

    return 0;
}
