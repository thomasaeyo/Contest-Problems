import java.util.Scanner;

public class MakeLargerNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(nextLargerNumber(x));
	}

	public static int nextLargerNumber(int x) {
		// digits to an array
		String s = "" + x;
		int[] digits = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			digits[i] = Integer.parseInt(s.substring(i,i+1));
		}
		// find the index where I can swap
		int index = -1;
		for(int i = digits.length - 1; i > 0; i--) {
			if(digits[i] > digits[i-1]) {
				index = i - 1;
				break;
			}
		}

		if(index == -1) {
			return x;
		}

		int index2 = index + 1;
		for(int i = index + 1; i < digits.length; i++) {
			if(digits[i] < digits[index]) {
				index2 = i - 1;
				break;
			}
		}

		// swap
		int temp = digits[index];
		digits[index] = digits[index2];
		digits[index2] = temp;

		// sort the rest by reversing
		int ii = digits.length - 1;
		for(int i = index + 1; i < (digits.length - index + 1) / 2; i++) {
			int t = digits[i];
			digits[i] = digits[ii];
			digits[ii] = t;
			ii--;
		}

		int ans = 0;
		for(int i = digits.length - 1; i >= 0; i--) {
			ans += digits[i] * Math.pow(10, digits.length - 1 - i);
		}

		return ans;
	}
}

