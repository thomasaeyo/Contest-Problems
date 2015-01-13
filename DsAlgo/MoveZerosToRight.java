import java.util.Scanner;


public class MoveZerosToRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		moveZeros(array);

		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void moveZeros(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while(left < right) {
			while(array[left] != 0) {
				left++;
			}

			while(array[right] == 0) {
				right--;
			}

			if(left < right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}