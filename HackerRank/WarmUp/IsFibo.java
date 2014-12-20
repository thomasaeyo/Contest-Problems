import java.util.Scanner;
import java.lang.Math;


public class IsFibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		// initialize fibonacci numbers
		long[] fib = new long[50];
		fib[0] = 1;
		fib[1] = 1;
		for(int i = 2; i < fib.length; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}

		for(int i = 0; i < t; i++) {
			long n = sc.nextLong();
			if(contains(fib,n))
				System.out.println("IsFibo");
			else
				System.out.println("IsNotFibo");
		}
	}

	public static boolean contains(long[] arr, long e) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == e) return true;
		}
		return false;
	}
}