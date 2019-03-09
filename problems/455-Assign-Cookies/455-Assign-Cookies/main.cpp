#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
	int findContentChildren(vector<int>& g, vector<int>& s) {
		sort(g.begin(), g.end());
		sort(s.begin(), s.end());

		int si = s.size() - 1, gi = g.size() - 1;
		int res = 0;
		while (si >= 0 && gi >= 0) {
			if (s[si] >= g[gi]) {
				res++;
				si--;
				gi--;
			}
			else
				gi--;
		}

		return res;
	}
};