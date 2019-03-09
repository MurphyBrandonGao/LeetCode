#include <iostream>
#include <vector>

using namespace std;

class Solution {
private:
	vector<vector<int>> res;

	//���C(n,k),��ǰ�Ѿ��ҵ�����ϴ洢��c�У���Ҫ��start��ʼ�����µ�Ԫ��
	void generateCombinations(int n, int k, int start, vector<int> &c) {
		if (c.size() == k) {
			res.push_back(c);
			return;
		}

		//����k-c.size()����λ�����ԣ�[i...n]������Ҫ��k-c.size()��Ԫ��
		//i���Ϊn-(k-c.size()) + 1
		for (int i = start; i <= n - (k - c.size()) + 1; i++) {
			c.push_back(i);
			generateCombinations(n, k, i + 1, c);
			c.pop_back();
		}

		return;
	}
public:
	vector<vector<int>> combine(int n, int k) {
		res.clear();
		if (n <= 0 || k <= 0 || k > n)
			return res;

		vector<int> c;
		generateCombinations(n, k, 1, c);

		return res;
	}
};