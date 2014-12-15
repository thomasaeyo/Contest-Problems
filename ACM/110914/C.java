import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.IndexOutOfBoundsException;

public class C {
	private static class Reader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public Reader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String next() throws IOException {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public String nextLine() throws IOException {
			return reader.readLine();
		}
	}

	public static void main(String[] args) throws IOException {
		Reader reader = new Reader(System.in);
		int n = reader.nextInt();
		int s = reader.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++) {
			numbers[i] = reader.nextInt();
		}

		int ans = 0;

		int[][] sum = new int[n][n];

		sum[0][0] = numbers[0];
		if(sum[0][0] == s) ans++;

		for(int j = 1; j < n; j++) {
			sum[0][j] = sum[0][j-1] + numbers[j];
			if(sum[0][j] == s) ans++;
		}

		for(int i = 1; i < n; i++) {
			for(int j = i; j < n; j++) {
				sum[i][j] = sum[i-1][j] - numbers[i-1];
				if(sum[i][j] == s) ans++;
			}
		}

		System.out.println(ans);
	}

}