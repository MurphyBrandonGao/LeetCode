#include <iostream>
#include <vector>

using namespace std;

class Solution {
private:
	vector<vector<int>> res;
	vector<bool> used;

	//p�б�����һ����index��Ԫ�ص�����
	//��������е�ĩβ��ӵ�index+1��Ԫ�أ����һ����index+1��Ԫ�ص�����
	void generatePermutation(const vector<int>& nums, int index, vector<int>& p) {
		if (index == nums.size()) {
			res.push_back(p);
			return;
		}

		for (int i = 0; i < nums.size(); i++) {
			if (!used[i]) {
				//��nums[i]�����p��
				p.push_back(nums[i]);
				used[i] = true;
				generatePermutation(nums, index + 1, p);
				p.pop_back();
				used[i] = false;
			}
		}

		return;
	}
public:
	vector<vector<int>> permute(vector<int>& nums) {
		res.clear();
		if (nums.size() == 0)
			return res;

		used = vector<bool>(nums.size(), false);
		vector<int> p;
		generatePermutation(nums, 0, p);

		return res;
	}
};