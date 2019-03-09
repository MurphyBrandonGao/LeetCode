#include <iostream>
#include <vector>
#include <string>

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
	vector<string> binaryTreePaths(TreeNode* root) {
		vector<string> res;
		if (root == NULL)
			return res;

		if (root->left == NULL && root->right == NULL) {
			res.push_back(to_string(root->val));
			return res;
		}

		vector<string> lefts = binaryTreePaths(root->left);
		for (int i = 0; i < lefts.size(); i++)
			res.push_back(to_string(root->val) + "->" + lefts[i]);

		vector<string> rights = binaryTreePaths(root->right);
		for (int i = 0; i < rights.size(); i++)
			res.push_back(to_string(root->val) + "->" + rights[i]);

		return res;
	}
};