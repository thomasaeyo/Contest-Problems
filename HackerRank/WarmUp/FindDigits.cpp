#include <iostream>
using namespace std;

int findDigits(int& n) {
	int ans = 0;
	int temp = n;
	while(temp > 0) {
		int d = temp % 10;
		if(d != 0 && n % d == 0) 
			ans++;
		temp = temp / 10;
	}
	return ans;
}

int main() {
	int t;
	cin >> t;

	int n;

	for(int i = 0; i < t; i++) {
		cin >> n;
		cout << findDigits(n) << endl;
	}

	return 0;
}