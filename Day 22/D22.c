/*
Problem: Count Nodes in Linked List

Input:
- First line: integer n
- Second line: n space-separated integers

Output:
- Print the result

Example:
Input:
5
10 20 30 40 50

Output:
10 20 30 40 50
5

*/

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

int countNodes(struct Node *head)
{
    int count = 0;
    struct Node *temp = head;

    while (temp != NULL)
    {
        count++;
        printf("%d ", temp->data);
        temp = temp->next;

    }

    return count;
}

int main()
{
    int n, value;

    scanf("%d", &n);

    struct Node *head = NULL;
    struct Node *tail = NULL;

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &value);

        struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->data = value;
        newNode->next = NULL;

        if (head == NULL)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail->next = newNode;
            tail = newNode;
        }
    }

    printf("\n%d\n", countNodes(head));

    return 0;
}
