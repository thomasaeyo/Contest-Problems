import java.util.Scanner;
import java.util.Arrays;

public class LeastDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(leastDiff(array));
	}

	public static int leastDiff(int[] array) {
		Arrays.sort(array);
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i+1] - array[i] < min) 
				min = array[i+1] - array[i]; 
		}

		return min;
	}
}