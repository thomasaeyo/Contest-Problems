import java.util.Scanner;


public class specialSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("-------------------------------------------------------");
		sort(array);
		for(int i : array) System.out.print(i + " ");
		System.out.println();
	}

	public static void sort(int[] a) {
		int i = 0;
		int j = a.length - 1;

		while(i < j) {
			while(a[i] < 0) i++;
			while(a[j] >= 0) j--;

			if(i < j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}