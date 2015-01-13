#include <iostream>
#include <vector>
using namespace std;

void print(vector<int> arr) {
	for(int i = 0; i < arr.size(); i++)
		cout << arr[i] << " ";
	cout << endl;
}

void insertionSort(vector<int> arr) {
	int arr_size = arr.size();
	int val = arr[arr_size-1];

	int i = arr_size-2;
	while(arr[i] > val && i >= 0) {
		arr[i+1] = arr[i];
		print(arr);
		i--;
	}

	arr[i+1] = val;
	print(arr);
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

	insertionSort(arr);

	return 0;
}