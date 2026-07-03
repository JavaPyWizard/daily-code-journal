/*
170 - Two Sum III
Design a data structure that supports the following operations:

add(int number): Add the given number to an internal data structure.
find(int value): Return true if there exists any pair of numbers in the data structure whose sum equals value; otherwise, return false.
Example
TwoSum twoSum = new TwoSum();

twoSum.add(1);
twoSum.add(3);
twoSum.add(5);

twoSum.find(4); // true (1 + 3)
twoSum.find(7); // false

*/

/*
Approach 1 (Two Pointer )

Add - O(1)
Find - O(n log n) [O(n log n) (because of sorting) + O(n) (two-pointer) = O(n log n)]

 */

import java.util.*;

public class Two_Sum_III 
{
    List<Integer> li = new ArrayList<>();

    public void add(int number)
    {
        li.add(number);
    }

    public boolean find(int value)
    {
        Collections.sort(li);

        int l=0,r=li.size()-1,lv=0,rv=0;

         while (l < r) 
        {
            lv = li.get(l);  
            rv= li.get(r);

            if(lv+rv == value)
            {
                return true;
            }
            else if (lv+rv < value)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Two_Sum_III obj = new Two_Sum_III();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            obj.add(sc.nextInt());
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        if (obj.find(target))
            System.out.println("True");
        else
            System.out.println("False");

        sc.close();
    }
}

/*
Approach 2 (HashMap)
add() → O(1)
find() → O(n)

import java.util.*;

public class Two_Sum_III
{
    HashMap<Integer, Integer> map = new HashMap<>();

    public void add(int number)
    {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value)
    {
        for (int num : map.keySet())
        {
            int complement = value - num;

            if (complement == num)
            {
                if (map.get(num) > 1)
                    return true;
            }
            else if (map.containsKey(complement))
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Two_Sum_III obj = new Two_Sum_III();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            obj.add(sc.nextInt());
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        System.out.println(obj.find(target));

        sc.close();
    }
}
*/