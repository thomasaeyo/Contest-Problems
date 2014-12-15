import java.util.Scanner;
import java.util.HashSet;

public class fibonnaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(n + "th term of the Fibonnaci sequence: ");
		System.out.println(fib(n));
	}

	public static int fib(int n) {
		if(n == 1) return 1;
		int[] fib_array = new int[n];
		fib_array[0] = 1;
		fib_array[1] = 1;
		for(int i = 2; i < n; i ++) {
			fib_array[i] = fib_array[i-1] + fib_array[i-2];
		}
		return fib_array[n-1];
	}
}


// 1 1 2 3 5 