#include <iostream>
#include <string>
#include <math.h>
using namespace std;


int main() {
	int n,k;
	cin >> n >> k;
	
	string s;
	cin >> s;

	string ret = "";

	for(int i = 0; i < n; i++) {
		int val = (int)s[i] - 48;
		int j = i - 1;

		while(j >= 0 && j > i - k) {
			val = val ^ ((int)ret[j] - 48);
			j--;
		}

		ret += to_string(val);
	}

	cout << ret << endl;

	return 0;
}