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
	ListNode* removeElements(ListNode* head, int val) {

		/*while (head != NULL && head->val == val) {
			ListNode* delNode = head;
			head = delNode->next;
			delete delNode;
		}

		if (head == NULL)
			return NULL;*/

		ListNode* dummyHead = new ListNode(0);
		dummyHead->next = head;

		ListNode* cur = dummyHead;
		while (cur->next != NULL) {
			if (cur->next->val == val) {
				ListNode* delNode = cur->next;
				cur->next = delNode->next;
				delete delNode;
			}
			else
				cur = cur->next;
		}

		ListNode* retNode = dummyHead->next;
		delete dummyHead;

		return retNode;
	}
};