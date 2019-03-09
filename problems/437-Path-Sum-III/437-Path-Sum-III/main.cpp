#include <iostream>

using namespace std;

//Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
	//����rootΪ���ڵ�Ķ������У�Ѱ�Һ�Ϊsum��·��������������·������
	int pathSum(TreeNode* root, int sum) {
		if (root == NULL)
			return 0;

		//ÿһ���ڵ�Ѱ��·����3���ֹ��ɣ�
		//1.Ѱ�Ұ����ýڵ㣬�Һ�Ϊsum��·��
		//2.����������Ѱ�Ҳ������ýڵ�,�Һ�Ϊsum��·��
		//3.����������Ѱ�Ҳ������ýڵ�,�Һ�Ϊsum��·��
		int res = findPath(root, sum);
		res += pathSum(root->left, sum);
		res += pathSum(root->right, sum);

		return res;
	}

private:
	//����nodeΪ���ڵ�Ķ������У�Ѱ�Ұ���node�ģ���Ϊsum��·��
	//����������·������
	int findPath(TreeNode* node, int num) {
		if (node == NULL)
			return 0;

		int res = 0;
		if (node->val == num)
			res += 1;

		res += findPath(node->left, num - node->val);
		res += findPath(node->right, num - node->val);

		return res;
	}
};