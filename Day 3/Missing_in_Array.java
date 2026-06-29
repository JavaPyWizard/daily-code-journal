/*
You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.

*/

// Approach 1 (Optimal)
class Missing_in_Array 
{
    int missingNum(int arr[]) 
    {

        int n = arr.length + 1;

        int xor = 0;

        for (int i = 1; i <= n; i++) 
        {
            xor ^= i;
        }

        for (int i = 0; i < arr.length; i++) 
        {
            xor ^= arr[i];
        }

        return xor;
    }
}

// Approach 2 (Brute Force)
/*
class Solution {
    int missingNum(int arr[]) {
        Solution ob = new Solution();
        ob.sort(arr, 0, arr.length - 1);
        if (arr[0] != 1)
            return 1;
            
        int m = arr[0];
        
        if (arr.length == 1)
            return ++m;
            
        for (int i=1;i<arr.length;i++)
        {
            if(m+1 != arr[i])
            {
                return m+1;
            }
            m = arr[i];
        }
        
        return m+1;
        
    }
    
    void merge(int a[], int l, int m, int r)
    {

      	int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

      	for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int a[], int l, int r)
    {
        if (l < r) {
          
            int m = (l + r) / 2;

            sort(a, l, m);
            sort(a, m + 1, r);

            merge(a, l, m, r);
        }
    }
    
}
*/