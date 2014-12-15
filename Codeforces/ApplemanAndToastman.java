import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class ApplemanAndToastman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
			sum += numbers[i];
		}
		Arrays.sort(numbers);
		int ans = 0;
		int count = 0;
		while(count < 2*(n - (int)Math.pow(2, (int)(Math.log(n)/Math.log(2))))) {
			ans += numbers[numbers.length - count - 1];
			count++;
		}

		ans += sum*((int)(Math.log(n)/Math.log(2)) + 1);
		System.out.println(ans);
	}
}
122245678(10)
12224 5678(10)
12 224 56 78(10)
1 2 2 24 5 6 7 8(10)
	2 4			 8 (10)

