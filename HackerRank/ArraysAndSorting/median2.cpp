#include <iostream>
using namespace std;

int n;
int mid;

void print(int arr[]) {
	for(int i = 0; i < n; i++)
		cout << arr[i] << " ";
	cout << endl;
}

int partition(int arr[], int left, int right) {
	int p = right--;

	while(left < right) {
		while(arr[left] < arr[p] && left < p)
			left++;
		while(arr[right] > arr[p] && right > 0)
			right--;
		if(left < right)
			swap(arr[left],arr[right]);

		// cout << "left: " << left;
		// cout << " right: " << right << endl;
	}

	if(arr[left] > arr[p])
		swap(arr[left],arr[p]);

	return left;
}

int median(int arr[], int p) {
	if(p > mid) {
		int new_p = partition(arr,0,p-1);
		return median(arr,new_p);
	} else if(p < mid) {
		int new_p = partition(arr,p+1,n-1);
		return median(arr,new_p);
	}
	return arr[p];
}

int main() {
	cin >> n;
	mid = n / 2;

	int arr[n];
	for(int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	int p = partition(arr,0,n-1);
	cout << median(arr, p) << endl;

	return 0;
}