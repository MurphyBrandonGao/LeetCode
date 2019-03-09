#include <iostream>
#include <vector>
#include <string>
#include <cassert>

using namespace std;

class Solution {
private:
	const string letterMap[10] = {
		" ",     //0
		"",      //1
		"abc",   //2
		"def",   //3
		"ghi",   //4
		"jkl",   //5
		"mno",   //6
		"pqrs",  //7
		"tuv",   //8
		"wxyz"   //9
	};

	vector<string> res;

	//s�б����˴�ʱ��digits[0...index-1]����õ���һ����ĸ�ַ���
	//Ѱ�Һ�digits[index]ƥ�����ĸ�����digits[0...index]����õ��Ľ�
	void findCombination(const string &digits, int index, const string &s) {
		cout << index << ":" << s << endl;
		if (index == digits.size()) {
			//����s
			res.push_back(s);
			return;
		}
		char c = digits[index];
		assert(c >= '0' && c <= '9' && c != '1');
		string letters = letterMap[c - '0'];
		for (int i = 0; i < letters.size(); i++)
			findCombination(digits, index + 1, s + letters[i]);

		return;
	}

public:
	vector<string> letterCombinations(string digits) {
		res.clear();
		if (digits == "")
			return res;
		findCombination(digits, 0, "");
		return res;
	}
};

int main(){
	vector<string> res = Solution().letterCombinations("234");
	for (int i = 0; i < res.size(); i++)
		cout << res[i] << endl;

	return 0;
}