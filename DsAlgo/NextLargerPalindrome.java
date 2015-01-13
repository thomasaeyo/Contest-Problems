import java.util.Scanner;

public class NextLargerPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
	}

	public static int nextPalindrome(int x) {
		int[] digits = new int[(""+x).length()];
		int first_half = 0;
		for(int i = 0; i < digits.length / 2; i++) {
			first_half += digits[i] * Math.pow(10,i);
		}
		int second_half = 0;
		for(int i = digits.length - 1; i > digits.length / 2; i--) {
			second_half += digits[i] * Math.pow(10,digits.length - 1 - i);
		}



	}
}

// 123456
// 123321

// 12322
// 34512
// 34543
// 01234