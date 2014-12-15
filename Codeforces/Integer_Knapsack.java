import java.util.Scanner;
import java.util.Arrays;

public class Integer_Knapsack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] values = new int[n];
		int[] weights = new int[n];
		for(int x = 0; x < n; x++) {
			values[x] = sc.nextInt();
			weights[x] = sc.nextInt();
		}
		int[] dp = new int[k+1];
		dp[0] = 0;
		for(int i = 1; i < dp.length; i++) {
			int max = 0;
			for(int x = 0; x < n; x++) {
				if(weights[x] <= i){
					if(dp[i - weights[x]] + values[x] > max) max = dp[i - weights[x]] + values[x];
				}
			}
			dp[i] = max;
		}
		System.out.println(dp[dp.length-1]);
	}
}
