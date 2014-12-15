import java.util.Scanner;


public class binary_search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i ++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(search(numbers, 3));

	}
	// array is already sorted
	public static boolean search(int[] array, int v) {
		int lower = 0;
		int upper = array.length - 1;
		while(lower <= upper) {
			int mid = (lower + upper) / 2;
			if(array[mid] < v) lower = mid + 1;
            else if(array[mid] > v) upper = mid - 1;
			else return true;
		}
        return false;
	}
}
