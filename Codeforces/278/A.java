import java.util.Scanner;
import java.lang.Math;


public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int ans = 0;

		for(int i = 1; i < 11; i++) {
			if(isLucky(a+i)) {
				ans = i;
				break;
			}
		}

		System.out.println(ans);
	}

	public static boolean isLucky(int n) {

		while((n / 10) != 0) {
			int r = n % 10;
			
			if(r == 8 || r == -8) return true;

			n = n / 10;
		}

		if(n == 8) return true;

		return false;
	}
}