#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int solve() {
	int ans = 0;
}

int main() {
	long n;
	long k;
	cin >> n >> k;
	vctor<int> prices;
	for(int i = 0; i < n; i++) {
		int p; cin >> p;
		prices.push_back(p);
	}
	sort(prices.begin(), prices.end());

	return 0;
}