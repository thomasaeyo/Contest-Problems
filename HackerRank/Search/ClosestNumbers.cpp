#include <iostream>
#include <algorithm>
#include <cmath>
#include <climits>
#include <set>
#include <vector>
using namespace std;

int main() {
	int n; cin >> n;
	set<long> set;
	vector<long> arr;
	for(int i = 0; i < n; i++) {
		int v; cin >> v;
		set.insert(v);
		arr.push_back(abs(v));
	}
	sort(arr.begin(), arr.end());

	// Populate pairs 
	vector<pair<long,long>> pairs;
	long diff = LONG_MAX;
	for(int i = 0; i < n-1; i++) {
		long d = arr[i+1] - arr[i];

		if(d > diff)
			continue;
		if (d < diff) {
			pairs.clear();
			diff = d;
		}

		int v1 = set.find(arr[i]) == set.end() ? -arr[i] : arr[i];
		int v2 = set.find(arr[i+1]) == set.end() ? -arr[i+1] : arr[i+1];
		if(v1 < v2) {
			if(v1 < 0)
				pairs.insert(pairs.begin(), make_pair(v1,v2));
			else 
				pairs.push_back(make_pair(v1,v2));
		} else {
			if(v2 < 0)
				pairs.insert(pairs.begin(), make_pair(v2,v1));
			else 
				pairs.push_back(make_pair(v2,v1));
		}
	}
	// print
	for(auto& p : pairs) {
		cout << p.first << " " << p.second;
	}
	cout << endl;


	return 0;
}