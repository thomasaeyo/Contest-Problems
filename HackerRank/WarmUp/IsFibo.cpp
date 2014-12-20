#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int t;
	cin >> t;

	// Initialize fibonnaci numbers
	long fib[50];
	fib[0] = 1;
	fib[1] = 1;
	for(int i = 2; i < 50; i++) {
		fib[i] = fib[i-1] + fib[i-2];
	}

	long n;
	for(int i = 0; i < t; i++) {
		cin >> n;
		bool exists = find(begin(fib),end(fib),n) != end(fib);
		if(exists)
			cout << "IsFibo" << endl;
		else
			cout << "IsNotFibo" << endl;
	}

	return 0;
}