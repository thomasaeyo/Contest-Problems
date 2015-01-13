// Incomplete


#include <iostream>
#include <vector>
using namespace std;

void print(vector<int> arr) {
	for(int i = 0; i < arr.size(); i++) {
		cout << arr[i] << " ";
	}
	cout << endl;
}

int partition(vector<int> arr, int left, int right) {
	int p = right;
	right--;
	print(arr);
	cout << "partition: " << left << ", " << right << endl;
	cout << "p = " << p << " arr[p] = " << arr[p] << endl;
	while(left < right) {
		while(arr[left] < arr[p])
			left++;
		while(arr[right] > arr[p])
			right--;

		if(left < right) {
			swap(arr[left], arr[right]);
		}
	}
	cout << "p = " << p << " arr[p] = " << arr[p] << endl;

	swap(arr[p], arr[left]);
	print(arr);
	return left;
}

void quicksort(vector<int> arr, int left, int right) {
	if(left >= right) 
		return;

	int pivot = partition(arr, left, right);
	cout << "pivot: " << pivot << endl;
	quicksort(arr, left, pivot-1);
	// quicksort(arr, pivot, right);
}

int main() {
	int n;
	cin >> n;

	vector<int> arr;

	for(int i = 0; i < n; i++) {
		int v;
		cin >> v;
		arr.push_back(v);
	}

	quicksort(arr, 0, n-1);

	return 0;
}