#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

class Solution {
public:
	//时间复杂度为O(n)
	//时间复杂度为O(1)
	int minSubArrayLen(int s, vector<int>& nums) {
		int l = 0, r = -1; // nums[l...r]为我们的滑动窗口
		int sum = 0;
		int res = nums.size() + 1; 
		while (l < nums.size()) {
			if (r + 1 < nums.size() && sum < s)
				sum += nums[++r];
			else
				sum -= nums[l++];

			if (sum >= s)
				res = min(res, r - l + 1);
		}

		if (res == nums.size() + 1)
			return 0;
		return res;
	}
};