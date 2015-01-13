import java.util.Scanner;


public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int val = arr[n-1];

		int i = n-2;
		while(i >= 0) {
			if(arr[i] > val) {
				arr[i+1] = arr[i];
				print(arr);
			} else {
				arr[i+1] = val;
				print(arr);
				break;
			}
			i--;
		}
		if(i == -1) {
			arr[0] = val;
			print(arr);
		}
	}

	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}