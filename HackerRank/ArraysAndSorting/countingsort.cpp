#include <iostream>
#include <string>
using namespace std;


int main() {
	int n;
	cin >> n;

	int arr[n];
	string *str_arr = new string[n];
	int count[100] = {};

	// update arrays
	for(int i = 0; i < n; i++) {
		int val;
		string s;
		cin >> val >> s;

		arr[i] = val;
		str_arr[i] = s;
		count[val]++;
	}

	// update count array
	for(int i = 1; i < 100; i++) {
		count[i] += count[i-1];
	}

	// sort
	int sorted[n];
	string *str_sorted = new string[n];
	for(int i = n-1; i >= 0; i--) {
		int index = --count[arr[i]];
		sorted[index] = arr[i];
		str_sorted[index] = str_arr[i];
	}

	// print
	for(int i = 0; i < n; i++) {
		cout << sorted[i] << " " << str_sorted[i] << endl;
	}

	delete [] str_arr;
	delete [] str_sorted;


	return 0;
}