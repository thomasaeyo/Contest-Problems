public class Sort {
	public static void main(String[] args) {
		int[] array1 = {1,2,3};
		int[] array2 = {5,4,3,2,1};
		int[] array3 = {1,3,5,7,2};
		int[] array4 = {7,6,5,4,8};
		int[] array5 = {1};
		int[] array6 = {1,1,1,1,1,1,1,1,1,1};

		mergeSort(array1,0,array1.length-1);
		print(array1);
		mergeSort(array2,0,array2.length-1);
		print(array2);
		mergeSort(array3,0,array3.length-1);
		print(array3);
		mergeSort(array4,0,array4.length-1);
		print(array4);
		mergeSort(array5,0,array5.length-1);
		print(array5);
		mergeSort(array6,0,array6.length-1);
		print(array6);
		

	}

	/***************
	 *	INSERTION  *
	 ***************/
	public static void insertionSort(int[] array) {
		for(int j = 1; j < array.length; j++) {
			int value = array[j];
			int i = j-1;

			while(i >= 0 && array[i] > value) {
				array[i+1] = array[i];
				i--;
			}

			array[i+1] = value;
		}
	}

	/***********
	 *	Merge  *
	 ***********/
	public static void mergeSort(int[] array, int l, int r) {
		int mid = (l+r)/2;

		// Base case: one element
		if(l == r) return;

		// recursively sort subarrays
		mergeSort(array, l,mid);
		mergeSort(array, mid+1,r);

		// merge
		merge(array, l, r);
	}

	// merge two subarrays [l..mid] and [mid+1..r]
	public static void merge(int[] array, int l, int r) {
		int mid = (l+r)/2;

		// copy left subarray to a1
		int[] a1 = new int[mid - l + 2];
		a1[a1.length-1] = Integer.MAX_VALUE;
		for(int x = 0; x < mid-l+1; x++) {
			a1[x] = array[l+x];
		}

		// copy right subarray to a2
		int[] a2 = new int[r - mid + 1];
		a2[a2.length-1] = Integer.MAX_VALUE;
		for(int x = 0; x < r-mid; x++) {
			a2[x] = array[mid+x+1];
		}

		// pointers
		int i = 0; 
		int j = 0;

		for(int x = l; x < r+1; x++) {
			if(a1[i] <= a2[j]) {
				array[x] = a1[i];
				i++;
			} else {
				array[x] = a2[j];
				j++;
			}
		}
	}










	public static void print(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}