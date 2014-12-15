import java.util.Scanner;

// Allow [] as a subarray
public class max_subarray  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int max = 0;
		int sub_sum = 0;
		for(int i = 0; i < n; i ++) {
			int val = sc.nextInt();
			sub_sum = Math.max(0, sub_sum+val);
			max = Math.max(max, sub_sum);
		}

		System.out.println(max);
	}
}