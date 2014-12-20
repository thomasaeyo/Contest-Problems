import java.util.Scanner;


public class UtopianTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			System.out.println(getHeight(n));
		}
	}

	public static int getHeight(int n) {
		int height = 1;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) height *= 2;
			else height += 1;
		}
		return height;
	}
}