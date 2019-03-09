#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
	//ʱ�临�Ӷȣ�O(n)
	//�ռ临�Ӷȣ�O(1)
	void moveZeroes(vector<int>& nums) {
		int k = 0; // nums�У�[0...k)��Ԫ�ؾ�Ϊ��0Ԫ��

		//��������i��Ԫ�غ󣬱�֤[0...i]�����з�0Ԫ��
		//������˳��������[0...k)��
		//ͬʱ��֤[k...i)Ϊ0
		for (int i = 0; i < nums.size(); i++)
		if (nums[i])
		if (k != i)
			swap(nums[k++], nums[i]);
		else  // i == k
			k++;
	}
};

int main() {
	int arr[] = { 0, 1, 0, 3, 12 };
	vector<int> vec(arr, arr + sizeof(arr) / sizeof(int));

	Solution().moveZeroes(vec);

	for (int i = 0; i < vec.size(); i++)
	{
		cout << vec[i] << " ";
	}
	cout << endl;

	return 0;
}