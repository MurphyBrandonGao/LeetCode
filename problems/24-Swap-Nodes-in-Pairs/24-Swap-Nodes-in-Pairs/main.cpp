#include <iostream>

using namespace std;


//Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
	ListNode* swapPairs(ListNode* head) {
		ListNode* dummyNode = new ListNode(0);
		dummyNode->next = head;

		ListNode* p = dummyNode;
		while (p->next && p->next->next)
		{
			ListNode* node1 = p->next;
			ListNode* node2 = node1->next;
			ListNode* next = node2->next;

			node2->next = node1;
			node1->next = next;
			p->next = node2;

			p = node1;
		}

		ListNode* retNode = dummyNode->next;
		delete dummyNode;

		return retNode;
	}
};