import java.util.Scanner;
import java.lang.Math;


public class FindDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		for(int i = 0; i < t; i++) {
			n = sc.nextInt();
			System.out.println(findDigits(n));
		}
	}

	public static int findDigits(int n) {
		int ans = 0;
		int temp = n;
		
		while(temp > 0) {
			int d = temp % 10;
			if(d != 0 && n % d == 0) {
				ans++;
			}
			temp = temp / 10;
		}

		return ans;
	}
}