#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
private:
	//memo[i]��ʾ��������nums[i...n]���ܻ�õ��������
	vector<int> memo;

	//��������nums[index...nums.size())�����Χ������з���
	int tryRob(vector<int>& nums, int index) {
		if (index >= nums.size())
			return 0;

		if (memo[index] != -1)
			return memo[index];

		int res = 0;
		for (int i = index; i < nums.size(); i++)
			res = max(res, nums[i] + tryRob(nums, i + 2));
		memo[index] = res;
		
		return res;
	}
public:
	int rob(vector<int>& nums) {
		memo = vector<int>(nums.size(), -1);
		return tryRob(nums, 0);
	}
};