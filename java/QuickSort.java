import java.util.Scanner;


public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0; i < n; i ++) {
			a[i][0] = i;
			a[i][1] = sc.nextInt();
		}
		quicksort(a);
		for(int[] i : a) System.out.print(i[0] + ":" + i[1] + " ");
		System.out.println();
	}

	public static void quicksort(int[][] a) {
		quicksort_helper(a, 0, a.length-1);
	}

	public static void quicksort_helper(int[][] a, int left, int right) {
		int pivot = partition(a, left, right);
		if(left < pivot - 1) quicksort_helper(a, left, pivot-1);
		if(pivot < right) quicksort_helper(a, pivot, right);
	}

	// Partition the array
	// Return pivot index
	public static int partition(int[][] a, int left, int right) {
		int pivot = left;
		while(left <= right) {
			while(a[left][1] < a[pivot][1]) left++;
			while(a[pivot][1] < a[right][1]) right--;
			if(left <= right) {
				swap(a, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	public static void swap(int[][] array, int i, int j) {
		int[] temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}