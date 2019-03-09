#include<iostream>
#include<vector>
#include<cassert>

using namespace std;

class Solution {
private:
	int d[4][2] = { { 0, 1 }, { 1, 0 }, { 0, 1 }, { 1, 0 } };
	int m, n; //�У���
	vector<vector<bool>> visited;

	bool inArea(int x, int y) {
		return x >= 0 && x < m && y >= 0 && y < n;
	}

	//��grid[x][y]��λ�ÿ�ʼ������floodfill
	//��֤��x,y)�Ϸ�����grid[x][y]��û�б����ʹ���½��
	void dfs(vector<vector<char>>& grid, int x, int y) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++){
			int newX = x + d[i][0];
			int newY = y + d[i][1];
			if (inArea(newX, newY) && !visited[newX][newY] && grid[newX][newY] == '1') //��if�������˵ݹ���ֹ����
				dfs(grid, newX, newY);
		}
		return;
	}
public:
	int numIslands(vector<vector<char>>& grid) {
		m = grid.size();
		if (m == 0)
			return 0;
		n = grid[0].size();

		visited = vector<vector<bool>>(m, vector<bool>(n, false));
		int res = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1' && !visited[i][j]) {
					res++;
					dfs(grid, i, j);
				}
			}
		}
		return res;
	}
};