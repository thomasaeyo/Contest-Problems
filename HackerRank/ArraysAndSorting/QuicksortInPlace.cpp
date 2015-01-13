#include <iostream>
#include <vector>
using namespace std;

void print(vector<int> arr) {
	for(int i = 0; i < arr.size(); i++) {
		cout << arr[i] << " ";
	}
	cout << endl;
}

// last element as a pivot
// no duplicates
int partition(vector<int>& arr, int left, int right) {
	int p = right--;
	int pivot = arr[p];

	while(left < right) {
		while(arr[left] < pivot && left < p) {
			left++;
		}
		while(arr[right] > pivot && right > 0) {
			right--;
		}

		if(left < right) {
			swap(arr[left],arr[right]);
		}
	}
	if(arr[left] > arr[p])
		swap(arr[p],arr[left]);

	return left;
}

int partition2(vector<int>& arr, int left, int right) {
	int p = right;
	int pivot = arr[p];

	for(int i = 0; i < right; i++) {
		
	}
}

void quicksort(vector<int>& arr, int left, int right) {
	if(left < right) {
		int p = partition(arr, left, right);
		print(arr);
		quicksort(arr, left, p-1);
		quicksort(arr, p+1, right);
	}	
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

	// cout << partition(arr,0,n-1) << endl;
	quicksort(arr, 0, n-1);


	return 0;
}