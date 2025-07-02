#include <stdio.h>
#include <stdlib.h>

struct node {
    int val;
    struct node *next;
};

struct node* middleNode(struct node* head) {
    struct node* temp1 = head;
    struct node* temp2 = head;
    while (temp2 && temp2->next) {
        temp1 = temp1->next;
        temp2 = temp2->next->next;
    }
    return temp1;
}

struct node* insertTail(struct node* head, int x) {
    struct node* newNode = malloc(sizeof *newNode);
    newNode->val = x;
    newNode->next = NULL;

    if (!head) return newNode;

    struct node* temp = head;
    while (temp->next)
        temp = temp->next;
    temp->next = newNode;

    return head;
}

void print(struct node* newNode) {
    for (; newNode; newNode = newNode->next)
        printf("%d ", newNode->val);
    puts("");
}

int main(void) {
    int i, n, value;
    struct node* head = NULL;
    printf("Enter the length of linked list: ");
    scanf("%d", &n);
    printf("Enter the elements of linked list: ");
    for (i = 0; i < n; ++i) {
        scanf("%d", &value);
        head = insertTail(head, value);
    }

    struct node* mid = middleNode(head);
    printf("Middle (second if even): %d\n", mid->val);
    print(mid);
    return 0;
}
