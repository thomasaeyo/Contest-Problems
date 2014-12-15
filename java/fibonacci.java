import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class fibonacci {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n: ");
		int n = Integer.parseInt(reader.readLine());

		// algorithm
		int[] fib = new int[n];
		for(int i = 0; i < n; i ++) {
			if(i == 0 || i == 1) fib[i] = 1;
			else {
				fib[i] = fib[i-1] + fib[i-2];
			}
		}

		System.out.println(fib[n-1]);
	}
}

// 1 1 2 3 5 8