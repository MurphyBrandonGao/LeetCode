#include <iostream>
#include <vector>
#include <cassert>

using namespace std;

class Solution {
private:
	int d[4][2] = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	int m, n;//行，列 
	vector<vector<bool>> visited;

	bool inArea(int x, int y) {
		return x >= 0 && x < m && y >= 0 && y < n;
	}

	//从board[startX][startY]开始，寻找word[index...word.size())
	bool searchWord(const vector<vector<char>>& board, const string& word, int index, int startY, int startX) {
		if (index == word.size() - 1)
			return board[startX][startY] == word[index];

		if (board[startX][startY] == word[index]) {
			visited[startX][startY] == true;
			//从startX,startY出发，向四个方向寻找
			for (int i = 0; i < 4; i++) {
				int newX = startX + d[i][0];
				int newY = startY + d[i][1];
				if (inArea(newX, newY) && !visited[newX][newY] && searchWord(board, word, index + 1, newX, newY))
					return true;
			}
			visited[startX][startY] = false;
		}

		return false;
	}
public:
	bool exist(vector<vector<char>>& board, string word) {
		m = board.size();
		assert(m > 0);
		n = board[0].size();

		visited = vector<vector<bool>>(m, vector<bool>(n, false));

		for (int i = 0; i < board.size(); i++) 
			for (int j = 0; j < board[i].size(); j++) 
				if (searchWord(board, word, 0, i, j))
					return true;
			
		return false;
	}
};