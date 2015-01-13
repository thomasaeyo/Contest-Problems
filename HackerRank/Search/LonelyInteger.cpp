#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
	int n;
	cin >> n;

	unordered_map<int, int> m;


	for(int i = 0; i < n; i++) {
		int v; cin >> v;
		try {
			m[v]++;
		} catch (const out_of_range& oor) {
			m[v] = 1;
		}
	}

	for(auto& it : m) {
		if(it.second == 1)
			cout << it.first << endl;
	}
	
	return 0;
}