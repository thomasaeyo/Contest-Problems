import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.IndexOutOfBoundsException;

public class J {
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
		int[] a = new int[n];
		int[] b = new int[n];
		int max_a = 0;
		int max_b = 0;
		int ans = 0;

		for(int i = 0; i < n; i++) {
			int a_i = reader.nextInt();
			int b_i = reader.nextInt();

			if(a_i > max_a && b_i >= ans) {
				ans = b_i;
				max_a = a_i;
				max_b = b_i;
			}

			if(a_i > max_a) max_a = a_i;
			if(b_i > max_b) max_b = b_i;
		}
		System.out.println(ans);
	}

}