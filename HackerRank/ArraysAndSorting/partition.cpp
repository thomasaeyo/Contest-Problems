#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void print(vector<int> arr) {
	for(int i = 0; i < arr.size(); i++) {
		cout << arr[i] << " ";
	}

	cout << endl;
}

void partition(vector<int> arr, int p) {
	int left = p + 1;
	int right = arr.size() - 1;
	int pivot = arr[p];

	while(left < right) {
		while(arr[left] <= pivot) 
			left++;
		while(arr[right] >= pivot)
			right--;

		if(left < right) {
			cout << "swap " << left << " and " << right << endl;
			swap(arr[left], arr[right]);
			print(arr);
			left++;
			right--;
		}
	}

	swap(arr[p], arr[right]);
	print(arr);
}

int main() {
	int n;
	cin >> n;

	vector<int> arr;
	for(int i = 0; i < n; i++) {
		int e;
		cin >> e;
		arr.push_back(e);
	}

	partition(arr, 0);

	return 0;
}