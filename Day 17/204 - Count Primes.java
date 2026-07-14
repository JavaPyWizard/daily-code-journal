/*
Given an integer n, return the number of prime numbers that are strictly less than n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
*/

// Sieve of Eratosthenes       O(n log log n)
class Solution {
    public int countPrimes(int n) 
    {

        if(n <= 2)
            return 0;

        boolean[] flag = new boolean[n];

        for(int i = 2; i < n; i++)
            flag[i] = true;

        for(int i = 2; i * i < n; i++) 
        {
            if(flag[i]) 
            {
                for(int j = i * i; j < n; j += i)
                    flag[j] = false;
            }
        }

        int counter = 0;

        for(int i = 2; i < n; i++) 
        {
            if(flag[i])
                counter++;
        }

        return counter;
    }
}

// O(n√n)
// class Solution {
//     public int countPrimes(int n) 
//     {
//         if(n<=0)
//             return 0;
//         int counter=1,flag=1;
//         for(int i=3;i<n;i++)
//         {
//             flag=1;
//             for(int j=2;j*j<=i;j++)
//             {
//                 if(i%j==0)
//                 {
//                     flag=0;
//                     break;
//                 }
//             }
//             if(flag==1)
//                 counter++;
//         }
//         return counter;
//     }
// }