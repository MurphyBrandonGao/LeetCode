#include <iostream>
#include <vector>
#include <cassert>
#include <unordered_map>

using namespace std;

//ʱ�临�Ӷȣ�O(n)
//�ռ临�Ӷȣ�O(n)
class Solution {
public:
	vector<int> twoSum(vector<int>& nums, int target) {
		unordered_map<int, int> record;
		for (int i = 0; i < nums.size(); i++) {
			int complete = target - nums[i];
			if (record.find(complete) != record.end()) {
				int res[2] = { i, record[complete] };
				return vector<int>(res, res + 2);
			}
			record[nums[i]] = i;
		}
	
		throw invalid_argument("The input has no solution.");
	}
};