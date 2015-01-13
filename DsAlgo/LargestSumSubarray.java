import java.util.Scanner;

public class LargestSumSubarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int[] subarray = getSubArray(array);
		for(int i = 0; i < subarray.length; i++) {
			System.out.print(subarray[i] + " ");
		}
		System.out.println();
	}

	public static int[] getSubArray(int[] array) {
		int max = 0;
		int max_start = 0;
		int max_end = 0;
		int start = 0;
		int subarray_sum = 0;

		for(int i = 0; i < array.length; i++) {
			if(subarray_sum + array[i] <= 0) {
				start = i + 1;
				subarray_sum = 0;
			} else {
				subarray_sum += array[i];
			}

			if(subarray_sum > max) {
				max = subarray_sum;
				max_start = start;
				max_end = i;
			}
		}

		int[] subarray = new int[max_end - max_start + 1];
		for(int i = max_start; i <= max_end; i++) {
			subarray[i - max_start] = array[i];
		}

		return subarray;
	}
}

