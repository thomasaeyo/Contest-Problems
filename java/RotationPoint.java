import java.util.Scanner;
import java.util.HashSet;


public class RotationPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i ++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(findRotationPoint(numbers));
	}

	public static int findRotationPoint(int[] numbers){
		return findRotationPoint(numbers, 0, numbers.length - 1);
	}

	private static int findRotationPoint(int[] numbers, int l, int u) {
		if(l == u - 1) {
			if(numbers[l] < numbers[u])
				return numbers[u];
			else
				return numbers[l];
		}

		int mid = (l + u) / 2;

		if(numbers[l] < numbers[mid] && numbers[mid] > numbers[u])
			return findRotationPoint(numbers, mid, u);
		else if(numbers[l] > numbers[mid] && numbers[mid] < numbers[u])
			return findRotationPoint(numbers, l, mid);

		return numbers[numbers.length-1];
	}
}