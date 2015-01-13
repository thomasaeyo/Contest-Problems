#include <iostream>
#include <vector>
using namespace std;

void print(vector<int>& arr) {
	for(int i = 0; i < arr.size(); i++) {
		cout << arr[i] << " ";
	}
}

int partition(vector<int>& arr, int left, int right) {
	int p = right--; // last element as pivot

	while(left < right) {
		while(arr[left] < arr[p])
			left++;
		while(arr[right] > arr[p]) 
			right--;

		if(left < right)
			swap(arr[left],arr[right]);
	}

	swap(arr[left], arr[p]);
	return left;
}

void findMedian(vector<int>& arr, int left, int right) {
	int p = partition(arr, left, right);
	int n = arr.size();

	if(p < n/2) {
		findMedian(arr, p+1, right);
	} else if(p > n/2) {
		findMedian(arr, left, p-1);
	} else {
		cout << arr[p] << endl;
	}
}

int main() {
	int n;
	cin >> n;

	vector<int> arr;

	for(int i = 0; i < n; i++) {
		int val;
		cin >> val;
		arr.push_back(val);
	}

	findMedian(arr, 0, n-1);

	return 0;
}