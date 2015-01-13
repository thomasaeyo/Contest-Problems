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

	for(int i = 1; i < arr_size; i++) {
		int val = arr[i];
		int j = i-1;

		while(arr[j] > val && j >= 0) {
			arr[j+1] = arr[j];
			j--;
		}

		arr[j+1] = val;
		print(arr);
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

	insertionSort(arr);

	return 0;
}